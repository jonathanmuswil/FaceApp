import android.support.v4.app.G;
import android.support.v4.app.l;
import android.support.v4.app.s;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;

public abstract class wza<VIEW extends sla, PRESENTER extends xza<VIEW>, VIEWACTION>
  extends ala<VIEW, PRESENTER>
  implements zza
{
  private final boolean la;
  private final GVa<VIEWACTION> ma;
  private final FVa<Boolean> na;
  private boolean oa;
  private final jRa pa;
  private final View.OnClickListener qa;
  private final View.OnClickListener ra;
  private HashMap sa;
  
  public wza()
  {
    Object localObject = GVa.t();
    oXa.a(localObject, "PublishSubject.create()");
    this.ma = ((GVa)localObject);
    localObject = FVa.f(Boolean.valueOf(false));
    oXa.a(localObject, "BehaviorSubject.createDefault(false)");
    this.na = ((FVa)localObject);
    this.oa = true;
    this.pa = new jRa();
    this.qa = new uza(this);
    this.ra = new vza(this);
  }
  
  private final void b(YAa paramYAa)
  {
    LAa localLAa = gc();
    if (localLAa == null)
    {
      localLAa = LAa.la.a();
      G localG = Ka().a();
      localG.b(2131296750, localLAa);
      localG.a();
    }
    localLAa.b(paramYAa);
    paramYAa = eb();
    if (paramYAa != null)
    {
      paramYAa = paramYAa.findViewById(2131296750);
      if (paramYAa != null) {
        UPa.c(paramYAa, 0L, 1, null);
      }
    }
  }
  
  private final LAa gc()
  {
    return (LAa)Ka().a(2131296750);
  }
  
  private final void hc()
  {
    Object localObject = eb();
    if (localObject != null)
    {
      localObject = ((View)localObject).findViewById(2131296750);
      if (localObject != null) {
        UPa.a((View)localObject, 0L, 1, null);
      }
    }
    LAa localLAa = gc();
    if (localLAa != null)
    {
      localObject = Ka().a();
      ((G)localObject).a(localLAa);
      ((G)localObject).a();
    }
  }
  
  protected final void B(boolean paramBoolean)
  {
    this.oa = paramBoolean;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.sa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public boolean Qb()
  {
    return this.la;
  }
  
  public void a(YAa paramYAa)
  {
    FVa localFVa = this.na;
    boolean bool;
    if (paramYAa != null) {
      bool = true;
    } else {
      bool = false;
    }
    localFVa.a(Boolean.valueOf(bool));
    if (paramYAa == null) {
      hc();
    } else {
      b(paramYAa);
    }
  }
  
  protected final View.OnClickListener cc()
  {
    return this.qa;
  }
  
  protected final View.OnClickListener dc()
  {
    return this.ra;
  }
  
  public final FVa<Boolean> ec()
  {
    return this.na;
  }
  
  protected final jRa fc()
  {
    return this.pa;
  }
  
  public final GVa<VIEWACTION> getViewActions()
  {
    return this.ma;
  }
  
  public void sb()
  {
    ((xza)Ub()).a(this.oa);
    this.pa.i();
    super.sb();
    Lb();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */