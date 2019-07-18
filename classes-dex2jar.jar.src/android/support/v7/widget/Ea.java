package android.support.v7.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.view.y;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ea
  extends eb
{
  private static TimeInterpolator h;
  private ArrayList<RecyclerView.x> i = new ArrayList();
  private ArrayList<RecyclerView.x> j = new ArrayList();
  private ArrayList<b> k = new ArrayList();
  private ArrayList<a> l = new ArrayList();
  ArrayList<ArrayList<RecyclerView.x>> m = new ArrayList();
  ArrayList<ArrayList<b>> n = new ArrayList();
  ArrayList<ArrayList<a>> o = new ArrayList();
  ArrayList<RecyclerView.x> p = new ArrayList();
  ArrayList<RecyclerView.x> q = new ArrayList();
  ArrayList<RecyclerView.x> r = new ArrayList();
  ArrayList<RecyclerView.x> s = new ArrayList();
  
  private void a(List<a> paramList, RecyclerView.x paramx)
  {
    for (int i1 = paramList.size() - 1; i1 >= 0; i1--)
    {
      a locala = (a)paramList.get(i1);
      if ((a(locala, paramx)) && (locala.a == null) && (locala.b == null)) {
        paramList.remove(locala);
      }
    }
  }
  
  private boolean a(a parama, RecyclerView.x paramx)
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
    paramx.b.setAlpha(1.0F);
    paramx.b.setTranslationX(0.0F);
    paramx.b.setTranslationY(0.0F);
    a(paramx, bool);
    return true;
    label70:
    return false;
  }
  
  private void b(a parama)
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
  
  private void u(RecyclerView.x paramx)
  {
    View localView = paramx.b;
    ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
    this.r.add(paramx);
    localViewPropertyAnimator.setDuration(f()).alpha(0.0F).setListener(new Z(this, paramx, localViewPropertyAnimator, localView)).start();
  }
  
  private void v(RecyclerView.x paramx)
  {
    if (h == null) {
      h = new ValueAnimator().getInterpolator();
    }
    paramx.b.animate().setInterpolator(h);
    d(paramx);
  }
  
  void a(a parama)
  {
    Object localObject1 = parama.a;
    View localView = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((RecyclerView.x)localObject1).b;
    }
    Object localObject2 = parama.b;
    if (localObject2 != null) {
      localView = ((RecyclerView.x)localObject2).b;
    }
    if (localObject1 != null)
    {
      localObject2 = ((View)localObject1).animate().setDuration(d());
      this.s.add(parama.a);
      ((ViewPropertyAnimator)localObject2).translationX(parama.e - parama.c);
      ((ViewPropertyAnimator)localObject2).translationY(parama.f - parama.d);
      ((ViewPropertyAnimator)localObject2).alpha(0.0F).setListener(new ca(this, parama, (ViewPropertyAnimator)localObject2, (View)localObject1)).start();
    }
    if (localView != null)
    {
      localObject1 = localView.animate();
      this.s.add(parama.b);
      ((ViewPropertyAnimator)localObject1).translationX(0.0F).translationY(0.0F).setDuration(d()).alpha(1.0F).setListener(new da(this, parama, (ViewPropertyAnimator)localObject1, localView)).start();
    }
  }
  
  void a(List<RecyclerView.x> paramList)
  {
    for (int i1 = paramList.size() - 1; i1 >= 0; i1--) {
      ((RecyclerView.x)paramList.get(i1)).b.animate().cancel();
    }
  }
  
  public boolean a(RecyclerView.x paramx, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramx.b;
    paramInt1 += (int)localView.getTranslationX();
    int i1 = paramInt2 + (int)paramx.b.getTranslationY();
    v(paramx);
    paramInt2 = paramInt3 - paramInt1;
    int i2 = paramInt4 - i1;
    if ((paramInt2 == 0) && (i2 == 0))
    {
      j(paramx);
      return false;
    }
    if (paramInt2 != 0) {
      localView.setTranslationX(-paramInt2);
    }
    if (i2 != 0) {
      localView.setTranslationY(-i2);
    }
    this.k.add(new b(paramx, paramInt1, i1, paramInt3, paramInt4));
    return true;
  }
  
  public boolean a(RecyclerView.x paramx1, RecyclerView.x paramx2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramx1 == paramx2) {
      return a(paramx1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    float f1 = paramx1.b.getTranslationX();
    float f2 = paramx1.b.getTranslationY();
    float f3 = paramx1.b.getAlpha();
    v(paramx1);
    int i1 = (int)(paramInt3 - paramInt1 - f1);
    int i2 = (int)(paramInt4 - paramInt2 - f2);
    paramx1.b.setTranslationX(f1);
    paramx1.b.setTranslationY(f2);
    paramx1.b.setAlpha(f3);
    if (paramx2 != null)
    {
      v(paramx2);
      paramx2.b.setTranslationX(-i1);
      paramx2.b.setTranslationY(-i2);
      paramx2.b.setAlpha(0.0F);
    }
    this.l.add(new a(paramx1, paramx2, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public boolean a(RecyclerView.x paramx, List<Object> paramList)
  {
    boolean bool;
    if ((paramList.isEmpty()) && (!super.a(paramx, paramList))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void b()
  {
    Object localObject1;
    Object localObject2;
    for (int i1 = this.k.size() - 1; i1 >= 0; i1--)
    {
      localObject1 = (b)this.k.get(i1);
      localObject2 = ((b)localObject1).a.b;
      ((View)localObject2).setTranslationY(0.0F);
      ((View)localObject2).setTranslationX(0.0F);
      j(((b)localObject1).a);
      this.k.remove(i1);
    }
    for (i1 = this.i.size() - 1; i1 >= 0; i1--)
    {
      l((RecyclerView.x)this.i.get(i1));
      this.i.remove(i1);
    }
    for (i1 = this.j.size() - 1; i1 >= 0; i1--)
    {
      localObject2 = (RecyclerView.x)this.j.get(i1);
      ((RecyclerView.x)localObject2).b.setAlpha(1.0F);
      h((RecyclerView.x)localObject2);
      this.j.remove(i1);
    }
    for (i1 = this.l.size() - 1; i1 >= 0; i1--) {
      b((a)this.l.get(i1));
    }
    this.l.clear();
    if (!g()) {
      return;
    }
    int i2;
    for (i1 = this.n.size() - 1; i1 >= 0; i1--)
    {
      localObject1 = (ArrayList)this.n.get(i1);
      for (i2 = ((ArrayList)localObject1).size() - 1; i2 >= 0; i2--)
      {
        b localb = (b)((ArrayList)localObject1).get(i2);
        localObject2 = localb.a.b;
        ((View)localObject2).setTranslationY(0.0F);
        ((View)localObject2).setTranslationX(0.0F);
        j(localb.a);
        ((ArrayList)localObject1).remove(i2);
        if (((ArrayList)localObject1).isEmpty()) {
          this.n.remove(localObject1);
        }
      }
    }
    for (i1 = this.m.size() - 1; i1 >= 0; i1--)
    {
      localObject2 = (ArrayList)this.m.get(i1);
      for (i2 = ((ArrayList)localObject2).size() - 1; i2 >= 0; i2--)
      {
        localObject1 = (RecyclerView.x)((ArrayList)localObject2).get(i2);
        ((RecyclerView.x)localObject1).b.setAlpha(1.0F);
        h((RecyclerView.x)localObject1);
        ((ArrayList)localObject2).remove(i2);
        if (((ArrayList)localObject2).isEmpty()) {
          this.m.remove(localObject2);
        }
      }
    }
    for (i1 = this.o.size() - 1; i1 >= 0; i1--)
    {
      localObject2 = (ArrayList)this.o.get(i1);
      for (i2 = ((ArrayList)localObject2).size() - 1; i2 >= 0; i2--)
      {
        b((a)((ArrayList)localObject2).get(i2));
        if (((ArrayList)localObject2).isEmpty()) {
          this.o.remove(localObject2);
        }
      }
    }
    a(this.r);
    a(this.q);
    a(this.p);
    a(this.s);
    a();
  }
  
  void b(RecyclerView.x paramx, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramx.b;
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if (paramInt1 != 0) {
      localView.animate().translationX(0.0F);
    }
    if (paramInt2 != 0) {
      localView.animate().translationY(0.0F);
    }
    ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
    this.q.add(paramx);
    localViewPropertyAnimator.setDuration(e()).setListener(new ba(this, paramx, paramInt1, localView, paramInt2, localViewPropertyAnimator)).start();
  }
  
  public void d(RecyclerView.x paramx)
  {
    View localView = paramx.b;
    localView.animate().cancel();
    for (int i1 = this.k.size() - 1; i1 >= 0; i1--) {
      if (((b)this.k.get(i1)).a == paramx)
      {
        localView.setTranslationY(0.0F);
        localView.setTranslationX(0.0F);
        j(paramx);
        this.k.remove(i1);
      }
    }
    a(this.l, paramx);
    if (this.i.remove(paramx))
    {
      localView.setAlpha(1.0F);
      l(paramx);
    }
    if (this.j.remove(paramx))
    {
      localView.setAlpha(1.0F);
      h(paramx);
    }
    ArrayList localArrayList;
    for (i1 = this.o.size() - 1; i1 >= 0; i1--)
    {
      localArrayList = (ArrayList)this.o.get(i1);
      a(localArrayList, paramx);
      if (localArrayList.isEmpty()) {
        this.o.remove(i1);
      }
    }
    for (i1 = this.n.size() - 1; i1 >= 0; i1--)
    {
      localArrayList = (ArrayList)this.n.get(i1);
      for (int i2 = localArrayList.size() - 1; i2 >= 0; i2--) {
        if (((b)localArrayList.get(i2)).a == paramx)
        {
          localView.setTranslationY(0.0F);
          localView.setTranslationX(0.0F);
          j(paramx);
          localArrayList.remove(i2);
          if (!localArrayList.isEmpty()) {
            break;
          }
          this.n.remove(i1);
          break;
        }
      }
    }
    for (i1 = this.m.size() - 1; i1 >= 0; i1--)
    {
      localArrayList = (ArrayList)this.m.get(i1);
      if (localArrayList.remove(paramx))
      {
        localView.setAlpha(1.0F);
        h(paramx);
        if (localArrayList.isEmpty()) {
          this.m.remove(i1);
        }
      }
    }
    this.r.remove(paramx);
    this.p.remove(paramx);
    this.s.remove(paramx);
    this.q.remove(paramx);
    j();
  }
  
  public boolean f(RecyclerView.x paramx)
  {
    v(paramx);
    paramx.b.setAlpha(0.0F);
    this.j.add(paramx);
    return true;
  }
  
  public boolean g()
  {
    boolean bool;
    if ((this.j.isEmpty()) && (this.l.isEmpty()) && (this.k.isEmpty()) && (this.i.isEmpty()) && (this.q.isEmpty()) && (this.r.isEmpty()) && (this.p.isEmpty()) && (this.s.isEmpty()) && (this.n.isEmpty()) && (this.m.isEmpty()) && (this.o.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean g(RecyclerView.x paramx)
  {
    v(paramx);
    this.i.add(paramx);
    return true;
  }
  
  public void i()
  {
    boolean bool1 = this.i.isEmpty() ^ true;
    boolean bool2 = this.k.isEmpty() ^ true;
    boolean bool3 = this.l.isEmpty() ^ true;
    boolean bool4 = this.j.isEmpty() ^ true;
    if ((!bool1) && (!bool2) && (!bool4) && (!bool3)) {
      return;
    }
    Object localObject1 = this.i.iterator();
    while (((Iterator)localObject1).hasNext()) {
      u((RecyclerView.x)((Iterator)localObject1).next());
    }
    this.i.clear();
    Object localObject2;
    if (bool2)
    {
      localObject2 = new ArrayList();
      ((ArrayList)localObject2).addAll(this.k);
      this.n.add(localObject2);
      this.k.clear();
      localObject1 = new W(this, (ArrayList)localObject2);
      if (bool1) {
        y.a(((b)((ArrayList)localObject2).get(0)).a.b, (Runnable)localObject1, f());
      } else {
        ((Runnable)localObject1).run();
      }
    }
    if (bool3)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.l);
      this.o.add(localObject1);
      this.l.clear();
      localObject2 = new X(this, (ArrayList)localObject1);
      if (bool1) {
        y.a(((a)((ArrayList)localObject1).get(0)).a.b, (Runnable)localObject2, f());
      } else {
        ((Runnable)localObject2).run();
      }
    }
    if (bool4)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.j);
      this.m.add(localObject1);
      this.j.clear();
      localObject2 = new Y(this, (ArrayList)localObject1);
      if ((!bool1) && (!bool2) && (!bool3))
      {
        ((Runnable)localObject2).run();
      }
      else
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
    }
  }
  
  void j()
  {
    if (!g()) {
      a();
    }
  }
  
  void t(RecyclerView.x paramx)
  {
    View localView = paramx.b;
    ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
    this.p.add(paramx);
    localViewPropertyAnimator.alpha(1.0F).setDuration(c()).setListener(new aa(this, paramx, localView, localViewPropertyAnimator)).start();
  }
  
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
    
    a(RecyclerView.x paramx1, RecyclerView.x paramx2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
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
  
  private static class b
  {
    public RecyclerView.x a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    b(RecyclerView.x paramx, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this.a = paramx;
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramInt3;
      this.e = paramInt4;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */