package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

class ea
{
  private static final Object a = new Object();
  private static Field b;
  private static boolean c;
  private static final Object d = new Object();
  
  public static Bundle a(Notification.Builder paramBuilder, ca.a parama)
  {
    paramBuilder.addAction(parama.e(), parama.i(), parama.a());
    paramBuilder = new Bundle(parama.d());
    if (parama.f() != null) {
      paramBuilder.putParcelableArray("android.support.remoteInputs", a(parama.f()));
    }
    if (parama.c() != null) {
      paramBuilder.putParcelableArray("android.support.dataRemoteInputs", a(parama.c()));
    }
    paramBuilder.putBoolean("android.support.allowGeneratedReplies", parama.b());
    return paramBuilder;
  }
  
  public static Bundle a(Notification paramNotification)
  {
    synchronized (a)
    {
      if (c) {
        return null;
      }
      try
      {
        if (b == null)
        {
          localObject2 = Notification.class.getDeclaredField("extras");
          if (!Bundle.class.isAssignableFrom(((Field)localObject2).getType()))
          {
            Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
            c = true;
            return null;
          }
          ((Field)localObject2).setAccessible(true);
          b = (Field)localObject2;
        }
        Bundle localBundle = (Bundle)b.get(paramNotification);
        Object localObject2 = localBundle;
        if (localBundle == null)
        {
          localObject2 = new android/os/Bundle;
          ((Bundle)localObject2).<init>();
          b.set(paramNotification, localObject2);
        }
        return (Bundle)localObject2;
      }
      catch (NoSuchFieldException paramNotification)
      {
        Log.e("NotificationCompat", "Unable to access notification extras", paramNotification);
      }
      catch (IllegalAccessException paramNotification)
      {
        Log.e("NotificationCompat", "Unable to access notification extras", paramNotification);
      }
      c = true;
      return null;
    }
  }
  
  static Bundle a(ca.a parama)
  {
    Bundle localBundle1 = new Bundle();
    localBundle1.putInt("icon", parama.e());
    localBundle1.putCharSequence("title", parama.i());
    localBundle1.putParcelable("actionIntent", parama.a());
    Bundle localBundle2;
    if (parama.d() != null) {
      localBundle2 = new Bundle(parama.d());
    } else {
      localBundle2 = new Bundle();
    }
    localBundle2.putBoolean("android.support.allowGeneratedReplies", parama.b());
    localBundle1.putBundle("extras", localBundle2);
    localBundle1.putParcelableArray("remoteInputs", a(parama.f()));
    localBundle1.putBoolean("showsUserInterface", parama.h());
    localBundle1.putInt("semanticAction", parama.g());
    return localBundle1;
  }
  
  private static Bundle a(ga paramga)
  {
    new Bundle();
    paramga.a();
    throw null;
  }
  
  public static SparseArray<Bundle> a(List<Bundle> paramList)
  {
    int i = paramList.size();
    Object localObject1 = null;
    int j = 0;
    while (j < i)
    {
      Bundle localBundle = (Bundle)paramList.get(j);
      Object localObject2 = localObject1;
      if (localBundle != null)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new SparseArray();
        }
        ((SparseArray)localObject2).put(j, localBundle);
      }
      j++;
      localObject1 = localObject2;
    }
    return (SparseArray<Bundle>)localObject1;
  }
  
  private static Bundle[] a(ga[] paramArrayOfga)
  {
    if (paramArrayOfga == null) {
      return null;
    }
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfga.length];
    if (paramArrayOfga.length <= 0) {
      return arrayOfBundle;
    }
    a(paramArrayOfga[0]);
    throw null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */