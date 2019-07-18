import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import io.faceapp.k;
import java.util.HashMap;

public final class bLa
  extends ala<gLa, fLa>
  implements gLa
{
  private final int la = 2131493011;
  private final int ma = 2131689928;
  private final GVa<Object> na;
  private HashMap oa;
  
  public bLa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.na = localGVa;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.oa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public fLa Mb()
  {
    return new fLa();
  }
  
  public int Xb()
  {
    return this.ma;
  }
  
  public int Zb()
  {
    return this.la;
  }
  
  public void a(OKa paramOKa)
  {
    oXa.b(paramOKa, "elements");
    RecyclerView localRecyclerView = (RecyclerView)f(k.recyclerView);
    oXa.a(localRecyclerView, "recyclerView");
    ((_Ka)EPa.b(localRecyclerView)).a(paramOKa.a());
    e(paramOKa.b());
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject = (RecyclerView)f(k.recyclerView);
    oXa.a(localObject, "recyclerView");
    ((RecyclerView)localObject).setLayoutManager(new GridLayoutManager(La(), 1));
    RecyclerView localRecyclerView = (RecyclerView)f(k.recyclerView);
    oXa.a(localRecyclerView, "recyclerView");
    localObject = Jb();
    oXa.a(localObject, "requireContext()");
    localRecyclerView.setAdapter(new _Ka((Context)localObject));
    paramView.setFocusableInTouchMode(true);
    paramView.requestFocus();
    paramView.setOnKeyListener(new aLa(this));
    super.a(paramView, paramBundle);
  }
  
  protected void bc()
  {
    this.na.a(Boolean.valueOf(true));
  }
  
  public View f(int paramInt)
  {
    if (this.oa == null) {
      this.oa = new HashMap();
    }
    View localView1 = (View)this.oa.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.oa.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public void ua()
  {
    o localo = Ea();
    if (localo != null) {
      localo.onBackPressed();
    }
  }
  
  public QQa<Object> xa()
  {
    QQa localQQa = this.na.i();
    oXa.a(localQQa, "backClickedSubject.hide()");
    return localQQa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bLa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */