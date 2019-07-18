import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.facebook.FacebookSdk;
import com.facebook.internal.C;
import com.facebook.internal.y;
import com.facebook.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class zn$b
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable
{
  private WeakReference<View> a;
  private List<In> b;
  private final Handler c;
  private HashMap<String, String> d;
  private final String e;
  
  public zn$b(View paramView, Handler paramHandler, HashMap<String, String> paramHashMap, String paramString)
  {
    this.a = new WeakReference(paramView);
    this.c = paramHandler;
    this.d = paramHashMap;
    this.e = paramString;
    this.c.postDelayed(this, 200L);
  }
  
  public static List<zn.a> a(In paramIn, View paramView, List<Kn> paramList, int paramInt1, int paramInt2, String paramString)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(".");
    ((StringBuilder)localObject).append(String.valueOf(paramInt2));
    paramString = ((StringBuilder)localObject).toString();
    localObject = new ArrayList();
    if (paramView == null) {
      return (List<zn.a>)localObject;
    }
    int i;
    if (paramInt1 >= paramList.size())
    {
      ((List)localObject).add(new zn.a(paramView, paramString));
    }
    else
    {
      Kn localKn = (Kn)paramList.get(paramInt1);
      if (localKn.a.equals(".."))
      {
        paramView = paramView.getParent();
        if ((paramView instanceof ViewGroup))
        {
          paramView = a((ViewGroup)paramView);
          i = paramView.size();
          for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
            ((List)localObject).addAll(a(paramIn, (View)paramView.get(paramInt2), paramList, paramInt1 + 1, paramInt2, paramString));
          }
        }
        return (List<zn.a>)localObject;
      }
      if (localKn.a.equals("."))
      {
        ((List)localObject).add(new zn.a(paramView, paramString));
        return (List<zn.a>)localObject;
      }
      if (!a(paramView, localKn, paramInt2)) {
        return (List<zn.a>)localObject;
      }
      if (paramInt1 == paramList.size() - 1) {
        ((List)localObject).add(new zn.a(paramView, paramString));
      }
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = a((ViewGroup)paramView);
      i = paramView.size();
      for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
        ((List)localObject).addAll(a(paramIn, (View)paramView.get(paramInt2), paramList, paramInt1 + 1, paramInt2, paramString));
      }
    }
    return (List<zn.a>)localObject;
  }
  
  private static List<View> a(ViewGroup paramViewGroup)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = paramViewGroup.getChildAt(j);
      if (localView.getVisibility() == 0) {
        localArrayList.add(localView);
      }
    }
    return localArrayList;
  }
  
  private void a()
  {
    if ((this.b != null) && (this.a.get() != null)) {
      for (int i = 0; i < this.b.size(); i++) {
        a((In)this.b.get(i), (View)this.a.get());
      }
    }
  }
  
  private void a(zn.a parama, View paramView, In paramIn)
  {
    if (paramIn == null) {
      return;
    }
    try
    {
      View localView = parama.a();
      if (localView == null) {
        return;
      }
      Object localObject = Nn.a(localView);
      if ((localObject != null) && (Nn.a(localView, (View)localObject)))
      {
        a(parama, paramView, (View)localObject, paramIn);
        return;
      }
      if (localView.getClass().getName().startsWith("com.facebook.react")) {
        return;
      }
      parama = parama.b();
      localObject = Nn.d(localView);
      int i = 1;
      int j;
      if (localObject != null) {
        j = 1;
      } else {
        j = 0;
      }
      int k;
      if ((j != 0) && ((localObject instanceof xn.a))) {
        k = 1;
      } else {
        k = 0;
      }
      if ((k == 0) || (!((xn.a)localObject).a())) {
        i = 0;
      }
      if ((!this.d.containsKey(parama)) && ((j == 0) || (k == 0) || (i == 0)))
      {
        localView.setAccessibilityDelegate(xn.a(paramIn, paramView, localView));
        this.d.put(parama, paramIn.b());
      }
    }
    catch (p parama)
    {
      Log.e(zn.a(), "Failed to attach auto logging event listener.", parama);
    }
  }
  
  private void a(zn.a parama, View paramView1, View paramView2, In paramIn)
  {
    if (paramIn == null) {
      return;
    }
    View localView = parama.a();
    if ((localView != null) && (Nn.a(localView, paramView2)))
    {
      paramView2 = parama.b();
      parama = Nn.e(localView);
      int i = 1;
      int j;
      if (parama != null) {
        j = 1;
      } else {
        j = 0;
      }
      int k;
      if ((j != 0) && ((parama instanceof Bn.a))) {
        k = 1;
      } else {
        k = 0;
      }
      if ((k == 0) || (!((Bn.a)parama).h())) {
        i = 0;
      }
      if ((!this.d.containsKey(paramView2)) && ((j == 0) || (k == 0) || (i == 0)))
      {
        localView.setOnTouchListener(Bn.a(paramIn, paramView1, localView));
        this.d.put(paramView2, paramIn.b());
      }
    }
  }
  
  private static boolean a(View paramView, Kn paramKn, int paramInt)
  {
    int i = paramKn.b;
    if ((i != -1) && (paramInt != i)) {
      return false;
    }
    Object localObject;
    if (!paramView.getClass().getCanonicalName().equals(paramKn.a))
    {
      if (paramKn.a.matches(".*android\\..*"))
      {
        localObject = paramKn.a.split("\\.");
        if (localObject.length > 0)
        {
          localObject = localObject[(localObject.length - 1)];
          if (paramView.getClass().getSimpleName().equals(localObject)) {
            break label90;
          }
        }
      }
      return false;
    }
    label90:
    if (((paramKn.h & Kn.a.a.a()) > 0) && (paramKn.c != paramView.getId())) {
      return false;
    }
    if (((paramKn.h & Kn.a.b.a()) > 0) && (!paramKn.d.equals(Nn.g(paramView)))) {
      return false;
    }
    i = paramKn.h;
    paramInt = Kn.a.d.a();
    String str1 = "";
    if ((i & paramInt) > 0)
    {
      String str2 = paramKn.f;
      if (paramView.getContentDescription() == null) {
        localObject = "";
      } else {
        localObject = String.valueOf(paramView.getContentDescription());
      }
      if (!str2.equals(localObject)) {
        return false;
      }
    }
    if (((paramKn.h & Kn.a.e.a()) > 0) && (!paramKn.g.equals(Nn.f(paramView)))) {
      return false;
    }
    if ((paramKn.h & Kn.a.c.a()) > 0)
    {
      paramKn = paramKn.e;
      if (paramView.getTag() == null) {
        paramView = str1;
      } else {
        paramView = String.valueOf(paramView.getTag());
      }
      if (!paramKn.equals(paramView)) {
        return false;
      }
    }
    return true;
  }
  
  public void a(In paramIn, View paramView)
  {
    if ((paramIn != null) && (paramView != null))
    {
      if ((!TextUtils.isEmpty(paramIn.a())) && (!paramIn.a().equals(this.e))) {
        return;
      }
      Object localObject = paramIn.e();
      if (((List)localObject).size() > 25) {
        return;
      }
      localObject = a(paramIn, paramView, (List)localObject, 0, -1, this.e).iterator();
      while (((Iterator)localObject).hasNext()) {
        a((zn.a)((Iterator)localObject).next(), paramView, paramIn);
      }
    }
  }
  
  public void onGlobalLayout()
  {
    a();
  }
  
  public void onScrollChanged()
  {
    a();
  }
  
  public void run()
  {
    Object localObject = C.b(FacebookSdk.e());
    if ((localObject != null) && (((y)localObject).b()))
    {
      this.b = In.a(((y)localObject).f());
      if (this.b != null)
      {
        localObject = (View)this.a.get();
        if (localObject == null) {
          return;
        }
        localObject = ((View)localObject).getViewTreeObserver();
        if (((ViewTreeObserver)localObject).isAlive())
        {
          ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(this);
          ((ViewTreeObserver)localObject).addOnScrollChangedListener(this);
        }
        a();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zn$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */