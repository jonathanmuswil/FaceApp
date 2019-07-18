import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.faceapp.MainActivity;
import io.faceapp.n;
import io.faceapp.ui.components.AppBar;
import io.faceapp.ui.components.AppBar.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ala<V extends sla, P extends gla<V>>
  extends qla<V, P>
{
  private AppBar fa;
  private final int ga = 2131690188;
  private final Integer ha;
  private final boolean ia = true;
  private final boolean ja;
  private List<ala.a> ka;
  
  protected final void A(boolean paramBoolean)
  {
    AppBar localAppBar = this.fa;
    if (localAppBar != null) {
      localAppBar.j(paramBoolean);
    }
  }
  
  public abstract void Lb();
  
  public final long Vb()
  {
    Object localObject = Ea();
    if (localObject != null)
    {
      localObject = ((Activity)localObject).getResources();
      if (localObject != null)
      {
        l = ((Resources)localObject).getInteger(2131361801);
        break label31;
      }
    }
    long l = 0L;
    label31:
    return 50L + l;
  }
  
  public Integer Wb()
  {
    return this.ha;
  }
  
  public int Xb()
  {
    return this.ga;
  }
  
  public boolean Yb()
  {
    return this.ja;
  }
  
  public abstract int Zb();
  
  public boolean _b()
  {
    return this.ia;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    oXa.b(paramLayoutInflater, "inflater");
    if (_b()) {
      Hb();
    }
    paramViewGroup = paramLayoutInflater.inflate(Zb(), paramViewGroup, false);
    this.fa = ((AppBar)paramViewGroup.findViewById(2131296307));
    paramBundle = this.fa;
    if (paramBundle != null)
    {
      paramLayoutInflater = Jb();
      oXa.a(paramLayoutInflater, "requireContext()");
      paramBundle.a(paramLayoutInflater, Xb(), Wb(), new bla(this));
    }
    oXa.a(paramViewGroup, "view");
    return paramViewGroup;
  }
  
  public final void a(View paramView, long paramLong, Runnable paramRunnable)
  {
    oXa.b(paramRunnable, "action");
    if (paramView == null) {
      return;
    }
    Object localObject = this.ka;
    if (localObject == null)
    {
      localObject = new ArrayList();
      this.ka = ((List)localObject);
    }
    ((List)localObject).add(new ala.a(paramView, paramRunnable));
    paramView.postDelayed(paramRunnable, paramLong);
  }
  
  protected final void a(AppBar.b paramb)
  {
    oXa.b(paramb, "navType");
    AppBar localAppBar = this.fa;
    if (localAppBar != null) {
      localAppBar.a(paramb, new cla(this));
    }
  }
  
  protected final MainActivity ac()
  {
    o localo1 = Ea();
    o localo2 = localo1;
    if (!(localo1 instanceof MainActivity)) {
      localo2 = null;
    }
    return (MainActivity)localo2;
  }
  
  public void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    if ((_b()) && (!Yb())) {
      EPa.a(this);
    }
  }
  
  protected void bc()
  {
    o localo = Ea();
    if (localo != null) {
      localo.onBackPressed();
    }
  }
  
  protected final void e(int paramInt)
  {
    AppBar localAppBar = this.fa;
    if (localAppBar != null) {
      localAppBar.setTitle(paramInt);
    }
  }
  
  public n getRouter()
  {
    Object localObject = ac();
    if (localObject != null) {
      localObject = ((MainActivity)localObject).n();
    } else {
      localObject = null;
    }
    return (n)localObject;
  }
  
  protected final void n(String paramString)
  {
    AppBar localAppBar = this.fa;
    if (localAppBar != null) {
      localAppBar.setTitle(paramString);
    }
  }
  
  public void sb()
  {
    List localList = this.ka;
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ala.a locala = (ala.a)localIterator.next();
        locala.a().removeCallbacks(locala.b());
      }
      localList.clear();
    }
    this.fa = null;
    super.sb();
    Lb();
  }
  
  protected final void z(boolean paramBoolean)
  {
    AppBar localAppBar = this.fa;
    if (localAppBar != null) {
      localAppBar.i(paramBoolean);
    }
  }
  
  private static final class a
  {
    private final View a;
    private final Runnable b;
    
    public a(View paramView, Runnable paramRunnable)
    {
      this.a = paramView;
      this.b = paramRunnable;
    }
    
    public final View a()
    {
      return this.a;
    }
    
    public final Runnable b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.a;
      int i = 0;
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = localObject.hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("PostDelayInfo(view=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", action=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ala.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */