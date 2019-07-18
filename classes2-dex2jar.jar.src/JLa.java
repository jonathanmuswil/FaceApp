import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import io.faceapp.MainActivity;
import io.faceapp.m;

public abstract class jLa<V extends kLa, P extends rla<? super V>>
  extends FrameLayout
  implements kLa
{
  private final QVa b;
  private final int c;
  
  static
  {
    rXa localrXa = new rXa(vXa.a(jLa.class), "presenter", "getPresenter()Lio/faceapp/mvp/MvpPresenter;");
    vXa.a(localrXa);
    a = new XXa[] { localrXa };
  }
  
  public jLa(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.c = paramInt;
    this.b = RVa.a(new iLa(this));
  }
  
  public QQa<Object> a()
  {
    return UPa.d(this, 0L, 1, null);
  }
  
  protected void a(View paramView)
  {
    oXa.b(paramView, "rootView");
  }
  
  public abstract P b();
  
  public final P getPresenter()
  {
    QVa localQVa = this.b;
    XXa localXXa = a[0];
    return (rla)localQVa.getValue();
  }
  
  public m getRouter()
  {
    Object localObject1 = getContext();
    boolean bool = localObject1 instanceof MainActivity;
    Object localObject2 = null;
    if (!bool) {
      localObject1 = null;
    }
    MainActivity localMainActivity = (MainActivity)localObject1;
    localObject1 = localObject2;
    if (localMainActivity != null) {
      localObject1 = localMainActivity.n();
    }
    return (m)localObject1;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (getChildCount() == 0) {
      View.inflate(getContext(), this.c, this);
    }
    a(this);
    getPresenter().b(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    getPresenter().a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jLa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */