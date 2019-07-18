package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class g
{
  private static final Object a = new Object();
  private static g b;
  private final Context c;
  private final HashMap<BroadcastReceiver, ArrayList<b>> d = new HashMap();
  private final HashMap<String, ArrayList<b>> e = new HashMap();
  private final ArrayList<a> f = new ArrayList();
  private final Handler g;
  
  private g(Context paramContext)
  {
    this.c = paramContext;
    this.g = new f(this, paramContext.getMainLooper());
  }
  
  public static g a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null)
      {
        g localg = new android/support/v4/content/g;
        localg.<init>(paramContext.getApplicationContext());
        b = localg;
      }
      paramContext = b;
      return paramContext;
    }
  }
  
  void a()
  {
    synchronized (this.d)
    {
      int i;
      a[] arrayOfa;
      do
      {
        i = this.f.size();
        if (i <= 0) {
          return;
        }
        arrayOfa = new a[i];
        this.f.toArray(arrayOfa);
        this.f.clear();
        i = 0;
      } while (i >= arrayOfa.length);
      a locala = arrayOfa[i];
      int j = locala.b.size();
      for (int k = 0; k < j; k++)
      {
        ??? = (b)locala.b.get(k);
        if (!((b)???).d) {
          ((b)???).b.onReceive(this.c, locala.a);
        }
      }
      i++;
    }
  }
  
  public void a(BroadcastReceiver paramBroadcastReceiver)
  {
    synchronized (this.d)
    {
      ArrayList localArrayList1 = (ArrayList)this.d.remove(paramBroadcastReceiver);
      if (localArrayList1 == null) {
        return;
      }
      for (int i = localArrayList1.size() - 1; i >= 0; i--)
      {
        b localb1 = (b)localArrayList1.get(i);
        localb1.d = true;
        for (int j = 0; j < localb1.a.countActions(); j++)
        {
          String str = localb1.a.getAction(j);
          ArrayList localArrayList2 = (ArrayList)this.e.get(str);
          if (localArrayList2 != null)
          {
            for (int k = localArrayList2.size() - 1; k >= 0; k--)
            {
              b localb2 = (b)localArrayList2.get(k);
              if (localb2.b == paramBroadcastReceiver)
              {
                localb2.d = true;
                localArrayList2.remove(k);
              }
            }
            if (localArrayList2.size() <= 0) {
              this.e.remove(str);
            }
          }
        }
      }
      return;
    }
  }
  
  public void a(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    synchronized (this.d)
    {
      b localb = new android/support/v4/content/g$b;
      localb.<init>(paramIntentFilter, paramBroadcastReceiver);
      Object localObject1 = (ArrayList)this.d.get(paramBroadcastReceiver);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(1);
        this.d.put(paramBroadcastReceiver, localObject2);
      }
      ((ArrayList)localObject2).add(localb);
      for (int i = 0; i < paramIntentFilter.countActions(); i++)
      {
        localObject1 = paramIntentFilter.getAction(i);
        localObject2 = (ArrayList)this.e.get(localObject1);
        paramBroadcastReceiver = (BroadcastReceiver)localObject2;
        if (localObject2 == null)
        {
          paramBroadcastReceiver = new java/util/ArrayList;
          paramBroadcastReceiver.<init>(1);
          this.e.put(localObject1, paramBroadcastReceiver);
        }
        paramBroadcastReceiver.add(localb);
      }
      return;
    }
  }
  
  public boolean a(Intent paramIntent)
  {
    synchronized (this.d)
    {
      String str1 = paramIntent.getAction();
      Object localObject1 = paramIntent.resolveTypeIfNeeded(this.c.getContentResolver());
      Uri localUri = paramIntent.getData();
      String str2 = paramIntent.getScheme();
      Set localSet = paramIntent.getCategories();
      int i;
      if ((paramIntent.getFlags() & 0x8) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      Object localObject2;
      if (i != 0)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Resolving type ");
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" scheme ");
        ((StringBuilder)localObject2).append(str2);
        ((StringBuilder)localObject2).append(" of intent ");
        ((StringBuilder)localObject2).append(paramIntent);
        Log.v("LocalBroadcastManager", ((StringBuilder)localObject2).toString());
      }
      ArrayList localArrayList = (ArrayList)this.e.get(paramIntent.getAction());
      if (localArrayList != null)
      {
        if (i != 0)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Action list: ");
          ((StringBuilder)localObject2).append(localArrayList);
          Log.v("LocalBroadcastManager", ((StringBuilder)localObject2).toString());
        }
        Object localObject3 = null;
        for (int j = 0; j < localArrayList.size(); j++)
        {
          Object localObject4 = (b)localArrayList.get(j);
          if (i != 0)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((StringBuilder)localObject2).append("Matching against filter ");
            ((StringBuilder)localObject2).append(((b)localObject4).a);
            Log.v("LocalBroadcastManager", ((StringBuilder)localObject2).toString());
          }
          if (((b)localObject4).c)
          {
            if (i != 0) {
              Log.v("LocalBroadcastManager", "  Filter's target already added");
            }
          }
          else
          {
            IntentFilter localIntentFilter = ((b)localObject4).a;
            localObject2 = localObject3;
            int k = localIntentFilter.match(str1, (String)localObject1, str2, localUri, localSet, "LocalBroadcastManager");
            if (k >= 0)
            {
              if (i != 0)
              {
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                ((StringBuilder)localObject3).append("  Filter matched!  match=0x");
                ((StringBuilder)localObject3).append(Integer.toHexString(k));
                Log.v("LocalBroadcastManager", ((StringBuilder)localObject3).toString());
              }
              if (localObject2 == null)
              {
                localObject3 = new java/util/ArrayList;
                ((ArrayList)localObject3).<init>();
              }
              else
              {
                localObject3 = localObject2;
              }
              ((ArrayList)localObject3).add(localObject4);
              ((b)localObject4).c = true;
            }
            else if (i != 0)
            {
              if (k != -4)
              {
                if (k != -3)
                {
                  if (k != -2)
                  {
                    if (k != -1) {
                      localObject2 = "unknown reason";
                    } else {
                      localObject2 = "type";
                    }
                  }
                  else {
                    localObject2 = "data";
                  }
                }
                else {
                  localObject2 = "action";
                }
              }
              else {
                localObject2 = "category";
              }
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((StringBuilder)localObject4).append("  Filter did not match: ");
              ((StringBuilder)localObject4).append((String)localObject2);
              Log.v("LocalBroadcastManager", ((StringBuilder)localObject4).toString());
            }
          }
        }
        if (localObject3 != null)
        {
          for (i = 0; i < ((ArrayList)localObject3).size(); i++) {
            ((b)((ArrayList)localObject3).get(i)).c = false;
          }
          localObject1 = this.f;
          localObject2 = new android/support/v4/content/g$a;
          ((a)localObject2).<init>(paramIntent, (ArrayList)localObject3);
          ((ArrayList)localObject1).add(localObject2);
          if (!this.g.hasMessages(1)) {
            this.g.sendEmptyMessage(1);
          }
          return true;
        }
      }
      return false;
    }
  }
  
  private static final class a
  {
    final Intent a;
    final ArrayList<g.b> b;
    
    a(Intent paramIntent, ArrayList<g.b> paramArrayList)
    {
      this.a = paramIntent;
      this.b = paramArrayList;
    }
  }
  
  private static final class b
  {
    final IntentFilter a;
    final BroadcastReceiver b;
    boolean c;
    boolean d;
    
    b(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
    {
      this.a = paramIntentFilter;
      this.b = paramBroadcastReceiver;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(128);
      localStringBuilder.append("Receiver{");
      localStringBuilder.append(this.b);
      localStringBuilder.append(" filter=");
      localStringBuilder.append(this.a);
      if (this.d) {
        localStringBuilder.append(" DEAD");
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */