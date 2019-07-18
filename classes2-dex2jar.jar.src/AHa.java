import android.support.v4.view.J;
import android.support.v4.view.K;
import android.support.v4.view.y;
import android.support.v7.widget.RecyclerView.f;
import android.support.v7.widget.RecyclerView.x;
import android.support.v7.widget.eb;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class aHa
  extends eb
{
  private ArrayList<RecyclerView.x> h = new ArrayList();
  private ArrayList<RecyclerView.x> i = new ArrayList();
  private ArrayList<aHa.d> j = new ArrayList();
  private ArrayList<aHa.a> k = new ArrayList();
  private ArrayList<ArrayList<RecyclerView.x>> l = new ArrayList();
  private ArrayList<ArrayList<aHa.d>> m = new ArrayList();
  private ArrayList<ArrayList<aHa.a>> n = new ArrayList();
  protected ArrayList<RecyclerView.x> o = new ArrayList();
  private ArrayList<RecyclerView.x> p = new ArrayList();
  protected ArrayList<RecyclerView.x> q = new ArrayList();
  private ArrayList<RecyclerView.x> r = new ArrayList();
  protected Interpolator s = new DecelerateInterpolator();
  
  public aHa()
  {
    a(false);
  }
  
  private void A(RecyclerView.x paramx)
  {
    hHa.a(paramx.b);
    if ((paramx instanceof UGa)) {
      ((UGa)paramx).a(paramx);
    } else {
      w(paramx);
    }
  }
  
  private void a(aHa.a parama)
  {
    Object localObject = parama.a;
    View localView = null;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((RecyclerView.x)localObject).b;
    }
    RecyclerView.x localx = parama.b;
    if (localx != null) {
      localView = localx.b;
    }
    if (localObject != null)
    {
      this.r.add(parama.a);
      localObject = y.a((View)localObject);
      ((J)localObject).a(d());
      ((J)localObject).d(parama.e - parama.c);
      ((J)localObject).e(parama.f - parama.d);
      ((J)localObject).a(0.0F);
      ((J)localObject).a(new ZGa(this, parama, (J)localObject));
      ((J)localObject).c();
    }
    if (localView != null)
    {
      this.r.add(parama.b);
      localObject = y.a(localView);
      ((J)localObject).d(0.0F);
      ((J)localObject).e(0.0F);
      ((J)localObject).a(d());
      ((J)localObject).a(1.0F);
      ((J)localObject).a(new _Ga(this, parama, (J)localObject, localView));
      ((J)localObject).c();
    }
  }
  
  private void a(List<aHa.a> paramList, RecyclerView.x paramx)
  {
    for (int i1 = paramList.size() - 1; i1 >= 0; i1--)
    {
      aHa.a locala = (aHa.a)paramList.get(i1);
      if ((a(locala, paramx)) && (locala.a == null) && (locala.b == null)) {
        paramList.remove(locala);
      }
    }
  }
  
  private boolean a(aHa.a parama, RecyclerView.x paramx)
  {
    RecyclerView.x localx = parama.b;
    boolean bool = false;
    if (localx == paramx)
    {
      parama.b = null;
    }
    else
    {
      if (parama.a != paramx) {
        break label70;
      }
      parama.a = null;
      bool = true;
    }
    y.a(paramx.b, 1.0F);
    y.j(paramx.b, 0.0F);
    y.k(paramx.b, 0.0F);
    a(paramx, bool);
    return true;
    label70:
    return false;
  }
  
  private void b(aHa.a parama)
  {
    RecyclerView.x localx = parama.a;
    if (localx != null) {
      a(parama, localx);
    }
    localx = parama.b;
    if (localx != null) {
      a(parama, localx);
    }
  }
  
  private void b(RecyclerView.x paramx, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = paramx.b;
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if (paramInt1 != 0) {
      y.a((View)localObject).d(0.0F);
    }
    if (paramInt2 != 0) {
      y.a((View)localObject).e(0.0F);
    }
    this.p.add(paramx);
    localObject = y.a((View)localObject);
    ((J)localObject).a(e());
    ((J)localObject).a(new YGa(this, paramx, paramInt1, paramInt2, (J)localObject));
    ((J)localObject).c();
  }
  
  private void l()
  {
    if (!g()) {
      a();
    }
  }
  
  private void x(RecyclerView.x paramx)
  {
    if ((paramx instanceof UGa)) {
      ((UGa)paramx).b(paramx, new aHa.b(paramx));
    } else {
      t(paramx);
    }
    this.o.add(paramx);
  }
  
  private void y(RecyclerView.x paramx)
  {
    if ((paramx instanceof UGa)) {
      ((UGa)paramx).a(paramx, new aHa.c(paramx));
    } else {
      u(paramx);
    }
    this.q.add(paramx);
  }
  
  private void z(RecyclerView.x paramx)
  {
    hHa.a(paramx.b);
    if ((paramx instanceof UGa)) {
      ((UGa)paramx).b(paramx);
    } else {
      v(paramx);
    }
  }
  
  void a(List<RecyclerView.x> paramList)
  {
    for (int i1 = paramList.size() - 1; i1 >= 0; i1--) {
      y.a(((RecyclerView.x)paramList.get(i1)).b).a();
    }
  }
  
  public boolean a(RecyclerView.x paramx, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramx.b;
    paramInt1 = (int)(paramInt1 + y.s(localView));
    int i1 = (int)(paramInt2 + y.t(paramx.b));
    d(paramx);
    int i2 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - i1;
    if ((i2 == 0) && (paramInt2 == 0))
    {
      j(paramx);
      return false;
    }
    if (i2 != 0) {
      y.j(localView, -i2);
    }
    if (paramInt2 != 0) {
      y.k(localView, -paramInt2);
    }
    this.j.add(new aHa.d(paramx, paramInt1, i1, paramInt3, paramInt4, null));
    return true;
  }
  
  public boolean a(RecyclerView.x paramx1, RecyclerView.x paramx2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramx1 == paramx2) {
      return a(paramx1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    float f1 = y.s(paramx1.b);
    float f2 = y.t(paramx1.b);
    float f3 = y.c(paramx1.b);
    d(paramx1);
    int i1 = (int)(paramInt3 - paramInt1 - f1);
    int i2 = (int)(paramInt4 - paramInt2 - f2);
    y.j(paramx1.b, f1);
    y.k(paramx1.b, f2);
    y.a(paramx1.b, f3);
    if ((paramx2 != null) && (paramx2.b != null))
    {
      d(paramx2);
      y.j(paramx2.b, -i1);
      y.k(paramx2.b, -i2);
      y.a(paramx2.b, 0.0F);
    }
    this.k.add(new aHa.a(paramx1, paramx2, paramInt1, paramInt2, paramInt3, paramInt4, null));
    return true;
  }
  
  public void b()
  {
    Object localObject1;
    Object localObject2;
    for (int i1 = this.j.size() - 1; i1 >= 0; i1--)
    {
      localObject1 = (aHa.d)this.j.get(i1);
      localObject2 = ((aHa.d)localObject1).a.b;
      y.k((View)localObject2, 0.0F);
      y.j((View)localObject2, 0.0F);
      j(((aHa.d)localObject1).a);
      this.j.remove(i1);
    }
    for (i1 = this.h.size() - 1; i1 >= 0; i1--)
    {
      l((RecyclerView.x)this.h.get(i1));
      this.h.remove(i1);
    }
    for (i1 = this.i.size() - 1; i1 >= 0; i1--)
    {
      localObject1 = (RecyclerView.x)this.i.get(i1);
      hHa.a(((RecyclerView.x)localObject1).b);
      h((RecyclerView.x)localObject1);
      this.i.remove(i1);
    }
    for (i1 = this.k.size() - 1; i1 >= 0; i1--) {
      b((aHa.a)this.k.get(i1));
    }
    this.k.clear();
    if (!g()) {
      return;
    }
    int i2;
    for (i1 = this.m.size() - 1; i1 >= 0; i1--)
    {
      ArrayList localArrayList = (ArrayList)this.m.get(i1);
      for (i2 = localArrayList.size() - 1; i2 >= 0; i2--)
      {
        localObject2 = (aHa.d)localArrayList.get(i2);
        localObject1 = ((aHa.d)localObject2).a.b;
        y.k((View)localObject1, 0.0F);
        y.j((View)localObject1, 0.0F);
        j(((aHa.d)localObject2).a);
        localArrayList.remove(i2);
        if (localArrayList.isEmpty()) {
          this.m.remove(localArrayList);
        }
      }
    }
    for (i1 = this.l.size() - 1; i1 >= 0; i1--)
    {
      localObject2 = (ArrayList)this.l.get(i1);
      for (i2 = ((ArrayList)localObject2).size() - 1; i2 >= 0; i2--)
      {
        localObject1 = (RecyclerView.x)((ArrayList)localObject2).get(i2);
        y.a(((RecyclerView.x)localObject1).b, 1.0F);
        h((RecyclerView.x)localObject1);
        if (i2 < ((ArrayList)localObject2).size()) {
          ((ArrayList)localObject2).remove(i2);
        }
        if (((ArrayList)localObject2).isEmpty()) {
          this.l.remove(localObject2);
        }
      }
    }
    for (i1 = this.n.size() - 1; i1 >= 0; i1--)
    {
      localObject1 = (ArrayList)this.n.get(i1);
      for (i2 = ((ArrayList)localObject1).size() - 1; i2 >= 0; i2--)
      {
        b((aHa.a)((ArrayList)localObject1).get(i2));
        if (((ArrayList)localObject1).isEmpty()) {
          this.n.remove(localObject1);
        }
      }
    }
    a(this.q);
    a(this.p);
    a(this.o);
    a(this.r);
    a();
  }
  
  public void d(RecyclerView.x paramx)
  {
    Object localObject = paramx.b;
    y.a((View)localObject).a();
    for (int i1 = this.j.size() - 1; i1 >= 0; i1--) {
      if (((aHa.d)this.j.get(i1)).a == paramx)
      {
        y.k((View)localObject, 0.0F);
        y.j((View)localObject, 0.0F);
        j(paramx);
        this.j.remove(i1);
      }
    }
    a(this.k, paramx);
    if (this.h.remove(paramx))
    {
      hHa.a(paramx.b);
      l(paramx);
    }
    if (this.i.remove(paramx))
    {
      hHa.a(paramx.b);
      h(paramx);
    }
    ArrayList localArrayList;
    for (i1 = this.n.size() - 1; i1 >= 0; i1--)
    {
      localArrayList = (ArrayList)this.n.get(i1);
      a(localArrayList, paramx);
      if (localArrayList.isEmpty()) {
        this.n.remove(i1);
      }
    }
    for (i1 = this.m.size() - 1; i1 >= 0; i1--)
    {
      localArrayList = (ArrayList)this.m.get(i1);
      for (int i2 = localArrayList.size() - 1; i2 >= 0; i2--) {
        if (((aHa.d)localArrayList.get(i2)).a == paramx)
        {
          y.k((View)localObject, 0.0F);
          y.j((View)localObject, 0.0F);
          j(paramx);
          localArrayList.remove(i2);
          if (!localArrayList.isEmpty()) {
            break;
          }
          this.m.remove(i1);
          break;
        }
      }
    }
    for (i1 = this.l.size() - 1; i1 >= 0; i1--)
    {
      localObject = (ArrayList)this.l.get(i1);
      if (((ArrayList)localObject).remove(paramx))
      {
        hHa.a(paramx.b);
        h(paramx);
        if (((ArrayList)localObject).isEmpty()) {
          this.l.remove(i1);
        }
      }
    }
    this.q.remove(paramx);
    this.o.remove(paramx);
    this.r.remove(paramx);
    this.p.remove(paramx);
    l();
  }
  
  public void e(long paramLong)
  {
    a(paramLong);
    d(paramLong);
    b(paramLong);
    c(paramLong);
  }
  
  public boolean f(RecyclerView.x paramx)
  {
    d(paramx);
    z(paramx);
    this.i.add(paramx);
    return true;
  }
  
  public boolean g()
  {
    boolean bool;
    if ((this.i.isEmpty()) && (this.k.isEmpty()) && (this.j.isEmpty()) && (this.h.isEmpty()) && (this.p.isEmpty()) && (this.q.isEmpty()) && (this.o.isEmpty()) && (this.r.isEmpty()) && (this.m.isEmpty()) && (this.l.isEmpty()) && (this.n.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean g(RecyclerView.x paramx)
  {
    d(paramx);
    A(paramx);
    this.h.add(paramx);
    return true;
  }
  
  public void i()
  {
    boolean bool1 = this.h.isEmpty() ^ true;
    boolean bool2 = this.j.isEmpty() ^ true;
    boolean bool3 = this.k.isEmpty() ^ true;
    boolean bool4 = this.i.isEmpty() ^ true;
    if ((!bool1) && (!bool2) && (!bool4) && (!bool3)) {
      return;
    }
    Object localObject1 = this.h.iterator();
    while (((Iterator)localObject1).hasNext()) {
      y((RecyclerView.x)((Iterator)localObject1).next());
    }
    this.h.clear();
    Object localObject2;
    if (bool2)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.j);
      this.m.add(localObject1);
      this.j.clear();
      localObject2 = new VGa(this, (ArrayList)localObject1);
      if ((bool1) && (!k())) {
        y.a(((aHa.d)((ArrayList)localObject1).get(0)).a.b, (Runnable)localObject2, f());
      } else {
        ((Runnable)localObject2).run();
      }
    }
    if (bool3)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.k);
      this.n.add(localObject1);
      this.k.clear();
      localObject2 = new WGa(this, (ArrayList)localObject1);
      if ((bool1) && (!k())) {
        y.a(((aHa.a)((ArrayList)localObject1).get(0)).a.b, (Runnable)localObject2, f());
      } else {
        ((Runnable)localObject2).run();
      }
    }
    if (bool4)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.i);
      this.l.add(localObject1);
      this.i.clear();
      localObject2 = new XGa(this, (ArrayList)localObject1);
      if ((!j()) && ((bool1) || (bool2) || (bool3)))
      {
        long l1 = 0L;
        long l2;
        if (bool1) {
          l2 = f();
        } else {
          l2 = 0L;
        }
        if (bool2) {
          l3 = e();
        } else {
          l3 = 0L;
        }
        if (bool3) {
          l1 = d();
        }
        long l3 = Math.max(l3, l1);
        y.a(((RecyclerView.x)((ArrayList)localObject1).get(0)).b, (Runnable)localObject2, l2 + l3);
      }
      else
      {
        ((Runnable)localObject2).run();
      }
    }
  }
  
  protected abstract boolean j();
  
  protected abstract boolean k();
  
  protected abstract void t(RecyclerView.x paramx);
  
  protected abstract void u(RecyclerView.x paramx);
  
  protected abstract void v(RecyclerView.x paramx);
  
  protected void w(RecyclerView.x paramx) {}
  
  private static class a
  {
    public RecyclerView.x a;
    public RecyclerView.x b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    private a(RecyclerView.x paramx1, RecyclerView.x paramx2)
    {
      this.a = paramx1;
      this.b = paramx2;
    }
    
    private a(RecyclerView.x paramx1, RecyclerView.x paramx2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this(paramx1, paramx2);
      this.c = paramInt1;
      this.d = paramInt2;
      this.e = paramInt3;
      this.f = paramInt4;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ChangeInfo{oldHolder=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", newHolder=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", fromX=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", fromY=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", toX=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(", toY=");
      localStringBuilder.append(this.f);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  protected class b
    extends aHa.e
  {
    RecyclerView.x a;
    
    public b(RecyclerView.x paramx)
    {
      super();
      this.a = paramx;
    }
    
    public void a(View paramView)
    {
      hHa.a(paramView);
    }
    
    public void b(View paramView)
    {
      hHa.a(paramView);
      aHa.this.h(this.a);
      aHa.this.o.remove(this.a);
      aHa.f(aHa.this);
    }
    
    public void c(View paramView)
    {
      aHa.this.i(this.a);
    }
  }
  
  protected class c
    extends aHa.e
  {
    RecyclerView.x a;
    
    public c(RecyclerView.x paramx)
    {
      super();
      this.a = paramx;
    }
    
    public void a(View paramView)
    {
      hHa.a(paramView);
    }
    
    public void b(View paramView)
    {
      hHa.a(paramView);
      aHa.this.l(this.a);
      aHa.this.q.remove(this.a);
      aHa.f(aHa.this);
    }
    
    public void c(View paramView)
    {
      aHa.this.m(this.a);
    }
  }
  
  private static class d
  {
    public RecyclerView.x a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    private d(RecyclerView.x paramx, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this.a = paramx;
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramInt3;
      this.e = paramInt4;
    }
  }
  
  private static class e
    implements K
  {
    public void a(View paramView) {}
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/aHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */