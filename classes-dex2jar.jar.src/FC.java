import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public abstract class fc
  extends Eb
{
  private static final String[] K = { "android:visibility:visibility", "android:visibility:parent" };
  private int L = 3;
  
  private fc.b b(Mb paramMb1, Mb paramMb2)
  {
    fc.b localb = new fc.b();
    localb.a = false;
    localb.b = false;
    if ((paramMb1 != null) && (paramMb1.a.containsKey("android:visibility:visibility")))
    {
      localb.c = ((Integer)paramMb1.a.get("android:visibility:visibility")).intValue();
      localb.e = ((ViewGroup)paramMb1.a.get("android:visibility:parent"));
    }
    else
    {
      localb.c = -1;
      localb.e = null;
    }
    if ((paramMb2 != null) && (paramMb2.a.containsKey("android:visibility:visibility")))
    {
      localb.d = ((Integer)paramMb2.a.get("android:visibility:visibility")).intValue();
      localb.f = ((ViewGroup)paramMb2.a.get("android:visibility:parent"));
    }
    else
    {
      localb.d = -1;
      localb.f = null;
    }
    if ((paramMb1 != null) && (paramMb2 != null))
    {
      if ((localb.c == localb.d) && (localb.e == localb.f)) {
        return localb;
      }
      int i = localb.c;
      int j = localb.d;
      if (i != j)
      {
        if (i == 0)
        {
          localb.b = false;
          localb.a = true;
        }
        else if (j == 0)
        {
          localb.b = true;
          localb.a = true;
        }
      }
      else if (localb.f == null)
      {
        localb.b = false;
        localb.a = true;
      }
      else if (localb.e == null)
      {
        localb.b = true;
        localb.a = true;
      }
    }
    else if ((paramMb1 == null) && (localb.d == 0))
    {
      localb.b = true;
      localb.a = true;
    }
    else if ((paramMb2 == null) && (localb.c == 0))
    {
      localb.b = false;
      localb.a = true;
    }
    return localb;
  }
  
  private void d(Mb paramMb)
  {
    int i = paramMb.b.getVisibility();
    paramMb.a.put("android:visibility:visibility", Integer.valueOf(i));
    paramMb.a.put("android:visibility:parent", paramMb.b.getParent());
    int[] arrayOfInt = new int[2];
    paramMb.b.getLocationOnScreen(arrayOfInt);
    paramMb.a.put("android:visibility:screenLocation", arrayOfInt);
  }
  
  public Animator a(ViewGroup paramViewGroup, Mb paramMb1, int paramInt1, Mb paramMb2, int paramInt2)
  {
    if (((this.L & 0x1) == 1) && (paramMb2 != null))
    {
      if (paramMb1 == null)
      {
        View localView = (View)paramMb2.b.getParent();
        if (b(a(localView, false), b(localView, false)).a) {
          return null;
        }
      }
      return a(paramViewGroup, paramMb2.b, paramMb1, paramMb2);
    }
    return null;
  }
  
  public Animator a(ViewGroup paramViewGroup, Mb paramMb1, Mb paramMb2)
  {
    fc.b localb = b(paramMb1, paramMb2);
    if ((localb.a) && ((localb.e != null) || (localb.f != null)))
    {
      if (localb.b) {
        return a(paramViewGroup, paramMb1, localb.c, paramMb2, localb.d);
      }
      return b(paramViewGroup, paramMb1, localb.c, paramMb2, localb.d);
    }
    return null;
  }
  
  public abstract Animator a(ViewGroup paramViewGroup, View paramView, Mb paramMb1, Mb paramMb2);
  
  public void a(int paramInt)
  {
    if ((paramInt & 0xFFFFFFFC) == 0)
    {
      this.L = paramInt;
      return;
    }
    throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
  }
  
  public void a(Mb paramMb)
  {
    d(paramMb);
  }
  
  public boolean a(Mb paramMb1, Mb paramMb2)
  {
    boolean bool1 = false;
    if ((paramMb1 == null) && (paramMb2 == null)) {
      return false;
    }
    if ((paramMb1 != null) && (paramMb2 != null) && (paramMb2.a.containsKey("android:visibility:visibility") != paramMb1.a.containsKey("android:visibility:visibility"))) {
      return false;
    }
    paramMb1 = b(paramMb1, paramMb2);
    boolean bool2 = bool1;
    if (paramMb1.a) {
      if (paramMb1.c != 0)
      {
        bool2 = bool1;
        if (paramMb1.d != 0) {}
      }
      else
      {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public Animator b(ViewGroup paramViewGroup, Mb paramMb1, int paramInt1, Mb paramMb2, int paramInt2)
  {
    if ((this.L & 0x2) != 2) {
      return null;
    }
    if (paramMb1 != null) {
      localObject1 = paramMb1.b;
    } else {
      localObject1 = null;
    }
    if (paramMb2 != null) {
      localObject2 = paramMb2.b;
    } else {
      localObject2 = null;
    }
    if ((localObject2 != null) && (((View)localObject2).getParent() != null))
    {
      if ((paramInt2 == 4) || (localObject1 == localObject2))
      {
        Object localObject3 = null;
        localObject1 = localObject2;
        localObject2 = localObject3;
        break label264;
      }
      if (this.z) {
        break label145;
      }
      localObject2 = Lb.a(paramViewGroup, (View)localObject1, (View)((View)localObject1).getParent());
    }
    else
    {
      if (localObject2 == null) {
        break label132;
      }
    }
    for (;;)
    {
      localObject1 = null;
      break label264;
      label132:
      if (localObject1 == null) {
        break;
      }
      if (((View)localObject1).getParent() == null)
      {
        label145:
        localObject2 = localObject1;
      }
      else
      {
        if (!(((View)localObject1).getParent() instanceof View)) {
          break;
        }
        localObject2 = (View)((View)localObject1).getParent();
        if (!b(b((View)localObject2, true), a((View)localObject2, true)).a)
        {
          localObject2 = Lb.a(paramViewGroup, (View)localObject1, (View)localObject2);
        }
        else
        {
          if (((View)localObject2).getParent() == null)
          {
            paramInt1 = ((View)localObject2).getId();
            if ((paramInt1 != -1) && (paramViewGroup.findViewById(paramInt1) != null) && (this.z))
            {
              localObject2 = localObject1;
              continue;
            }
          }
          localObject2 = null;
        }
      }
    }
    Object localObject2 = null;
    Object localObject1 = localObject2;
    label264:
    if ((localObject2 != null) && (paramMb1 != null))
    {
      localObject1 = (int[])paramMb1.a.get("android:visibility:screenLocation");
      paramInt2 = localObject1[0];
      paramInt1 = localObject1[1];
      localObject1 = new int[2];
      paramViewGroup.getLocationOnScreen((int[])localObject1);
      ((View)localObject2).offsetLeftAndRight(paramInt2 - localObject1[0] - ((View)localObject2).getLeft());
      ((View)localObject2).offsetTopAndBottom(paramInt1 - localObject1[1] - ((View)localObject2).getTop());
      localObject1 = Rb.a(paramViewGroup);
      ((Qb)localObject1).a((View)localObject2);
      paramViewGroup = b(paramViewGroup, (View)localObject2, paramMb1, paramMb2);
      if (paramViewGroup == null) {
        ((Qb)localObject1).b((View)localObject2);
      } else {
        paramViewGroup.addListener(new ec(this, (Qb)localObject1, (View)localObject2));
      }
      return paramViewGroup;
    }
    if (localObject1 != null)
    {
      paramInt1 = ((View)localObject1).getVisibility();
      _b.a((View)localObject1, 0);
      paramViewGroup = b(paramViewGroup, (View)localObject1, paramMb1, paramMb2);
      if (paramViewGroup != null)
      {
        paramMb1 = new fc.a((View)localObject1, paramInt2, true);
        paramViewGroup.addListener(paramMb1);
        ab.a(paramViewGroup, paramMb1);
        a(paramMb1);
      }
      else
      {
        _b.a((View)localObject1, paramInt1);
      }
      return paramViewGroup;
    }
    return null;
  }
  
  public abstract Animator b(ViewGroup paramViewGroup, View paramView, Mb paramMb1, Mb paramMb2);
  
  public void c(Mb paramMb)
  {
    d(paramMb);
  }
  
  public String[] n()
  {
    return K;
  }
  
  private static class a
    extends AnimatorListenerAdapter
    implements Eb.c, ab.a
  {
    private final View a;
    private final int b;
    private final ViewGroup c;
    private final boolean d;
    private boolean e;
    boolean f = false;
    
    a(View paramView, int paramInt, boolean paramBoolean)
    {
      this.a = paramView;
      this.b = paramInt;
      this.c = ((ViewGroup)paramView.getParent());
      this.d = paramBoolean;
      a(true);
    }
    
    private void a()
    {
      if (!this.f)
      {
        _b.a(this.a, this.b);
        ViewGroup localViewGroup = this.c;
        if (localViewGroup != null) {
          localViewGroup.invalidate();
        }
      }
      a(false);
    }
    
    private void a(boolean paramBoolean)
    {
      if ((this.d) && (this.e != paramBoolean))
      {
        ViewGroup localViewGroup = this.c;
        if (localViewGroup != null)
        {
          this.e = paramBoolean;
          Rb.a(localViewGroup, paramBoolean);
        }
      }
    }
    
    public void a(Eb paramEb)
    {
      a(false);
    }
    
    public void b(Eb paramEb) {}
    
    public void c(Eb paramEb)
    {
      a(true);
    }
    
    public void d(Eb paramEb)
    {
      a();
      paramEb.b(this);
    }
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      this.f = true;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      a();
    }
    
    public void onAnimationPause(Animator paramAnimator)
    {
      if (!this.f) {
        _b.a(this.a, this.b);
      }
    }
    
    public void onAnimationRepeat(Animator paramAnimator) {}
    
    public void onAnimationResume(Animator paramAnimator)
    {
      if (!this.f) {
        _b.a(this.a, 0);
      }
    }
    
    public void onAnimationStart(Animator paramAnimator) {}
  }
  
  private static class b
  {
    boolean a;
    boolean b;
    int c;
    int d;
    ViewGroup e;
    ViewGroup f;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */