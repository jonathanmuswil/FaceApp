import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.y;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class mb
  extends Eb
{
  private static final String[] K = { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
  private static final Property<Drawable, PointF> L = new db(PointF.class, "boundsOrigin");
  private static final Property<mb.a, PointF> M = new eb(PointF.class, "topLeft");
  private static final Property<mb.a, PointF> N = new fb(PointF.class, "bottomRight");
  private static final Property<View, PointF> O = new gb(PointF.class, "bottomRight");
  private static final Property<View, PointF> P = new hb(PointF.class, "topLeft");
  private static final Property<View, PointF> Q = new ib(PointF.class, "position");
  private static zb R = new zb();
  private int[] S = new int[2];
  private boolean T = false;
  private boolean U = false;
  
  private boolean a(View paramView1, View paramView2)
  {
    boolean bool1 = this.U;
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (bool1)
    {
      Mb localMb = a(paramView1, true);
      if (localMb == null) {
        if (paramView1 == paramView2)
        {
          bool3 = bool2;
          break label60;
        }
      }
      while (paramView2 != localMb.b)
      {
        bool3 = false;
        break;
      }
      bool3 = bool2;
    }
    label60:
    return bool3;
  }
  
  private void d(Mb paramMb)
  {
    View localView = paramMb.b;
    if ((y.B(localView)) || (localView.getWidth() != 0) || (localView.getHeight() != 0))
    {
      paramMb.a.put("android:changeBounds:bounds", new Rect(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom()));
      paramMb.a.put("android:changeBounds:parent", paramMb.b.getParent());
      if (this.U)
      {
        paramMb.b.getLocationInWindow(this.S);
        paramMb.a.put("android:changeBounds:windowX", Integer.valueOf(this.S[0]));
        paramMb.a.put("android:changeBounds:windowY", Integer.valueOf(this.S[1]));
      }
      if (this.T) {
        paramMb.a.put("android:changeBounds:clip", y.f(localView));
      }
    }
  }
  
  public Animator a(ViewGroup paramViewGroup, Mb paramMb1, Mb paramMb2)
  {
    if ((paramMb1 != null) && (paramMb2 != null))
    {
      Object localObject1 = paramMb1.a;
      Object localObject2 = paramMb2.a;
      localObject1 = (ViewGroup)((Map)localObject1).get("android:changeBounds:parent");
      Object localObject3 = (ViewGroup)((Map)localObject2).get("android:changeBounds:parent");
      if ((localObject1 != null) && (localObject3 != null))
      {
        localObject2 = paramMb2.b;
        int k;
        int i7;
        int i8;
        int i9;
        if (a((View)localObject1, (View)localObject3))
        {
          paramViewGroup = (Rect)paramMb1.a.get("android:changeBounds:bounds");
          localObject1 = (Rect)paramMb2.a.get("android:changeBounds:bounds");
          int i = paramViewGroup.left;
          int j = ((Rect)localObject1).left;
          k = paramViewGroup.top;
          int m = ((Rect)localObject1).top;
          int n = paramViewGroup.right;
          int i1 = ((Rect)localObject1).right;
          int i2 = paramViewGroup.bottom;
          int i3 = ((Rect)localObject1).bottom;
          int i4 = n - i;
          int i5 = i2 - k;
          int i6 = i1 - j;
          i7 = i3 - m;
          paramMb1 = (Rect)paramMb1.a.get("android:changeBounds:clip");
          localObject3 = (Rect)paramMb2.a.get("android:changeBounds:clip");
          if (((i4 != 0) && (i5 != 0)) || ((i6 != 0) && (i7 != 0)))
          {
            if ((i == j) && (k == m)) {
              i8 = 0;
            } else {
              i8 = 1;
            }
            if (n == i1)
            {
              i9 = i8;
              if (i2 == i3) {}
            }
            else
            {
              i9 = i8 + 1;
            }
          }
          else
          {
            i9 = 0;
          }
          if ((paramMb1 == null) || (paramMb1.equals(localObject3)))
          {
            i8 = i9;
            if (paramMb1 == null)
            {
              i8 = i9;
              if (localObject3 == null) {}
            }
          }
          else
          {
            i8 = i9 + 1;
          }
          if (i8 > 0)
          {
            if (!this.T)
            {
              paramViewGroup = (ViewGroup)localObject2;
              _b.a(paramViewGroup, i, k, n, i2);
              if (i8 == 2)
              {
                if ((i4 == i6) && (i5 == i7))
                {
                  paramMb1 = f().a(i, k, j, m);
                  paramViewGroup = ub.a(paramViewGroup, Q, paramMb1);
                }
                else
                {
                  paramMb1 = new mb.a(paramViewGroup);
                  paramViewGroup = f().a(i, k, j, m);
                  paramMb2 = ub.a(paramMb1, M, paramViewGroup);
                  paramViewGroup = f().a(n, i2, i1, i3);
                  localObject1 = ub.a(paramMb1, N, paramViewGroup);
                  paramViewGroup = new AnimatorSet();
                  paramViewGroup.playTogether(new Animator[] { paramMb2, localObject1 });
                  paramViewGroup.addListener(new jb(this, paramMb1));
                }
              }
              else if ((i == j) && (k == m))
              {
                paramMb1 = f().a(n, i2, i1, i3);
                paramViewGroup = ub.a(paramViewGroup, O, paramMb1);
              }
              else
              {
                paramMb1 = f().a(i, k, j, m);
                paramViewGroup = ub.a(paramViewGroup, P, paramMb1);
              }
            }
            else
            {
              localObject1 = localObject2;
              _b.a((View)localObject1, i, k, Math.max(i4, i6) + i, Math.max(i5, i7) + k);
              if ((i == j) && (k == m))
              {
                paramViewGroup = null;
              }
              else
              {
                paramViewGroup = f().a(i, k, j, m);
                paramViewGroup = ub.a(localObject1, Q, paramViewGroup);
              }
              if (paramMb1 == null) {
                paramMb1 = new Rect(0, 0, i4, i5);
              }
              if (localObject3 == null) {
                paramMb2 = new Rect(0, 0, i6, i7);
              } else {
                paramMb2 = (Mb)localObject3;
              }
              if (!paramMb1.equals(paramMb2))
              {
                y.a((View)localObject1, paramMb1);
                paramMb1 = ObjectAnimator.ofObject(localObject1, "clipBounds", R, new Object[] { paramMb1, paramMb2 });
                paramMb1.addListener(new kb(this, (View)localObject1, (Rect)localObject3, j, m, i1, i3));
              }
              else
              {
                paramMb1 = null;
              }
              paramViewGroup = Lb.a(paramViewGroup, paramMb1);
            }
            if ((((View)localObject2).getParent() instanceof ViewGroup))
            {
              paramMb1 = (ViewGroup)((View)localObject2).getParent();
              Rb.a(paramMb1, true);
              a(new lb(this, paramMb1));
            }
            return paramViewGroup;
          }
        }
        else
        {
          i8 = ((Integer)paramMb1.a.get("android:changeBounds:windowX")).intValue();
          i9 = ((Integer)paramMb1.a.get("android:changeBounds:windowY")).intValue();
          i7 = ((Integer)paramMb2.a.get("android:changeBounds:windowX")).intValue();
          k = ((Integer)paramMb2.a.get("android:changeBounds:windowY")).intValue();
          if ((i8 != i7) || (i9 != k)) {
            break label943;
          }
        }
        return null;
        label943:
        paramViewGroup.getLocationInWindow(this.S);
        paramMb1 = Bitmap.createBitmap(((View)localObject2).getWidth(), ((View)localObject2).getHeight(), Bitmap.Config.ARGB_8888);
        ((View)localObject2).draw(new Canvas(paramMb1));
        paramMb1 = new BitmapDrawable(paramMb1);
        float f = _b.c((View)localObject2);
        _b.a((View)localObject2, 0.0F);
        _b.b(paramViewGroup).a(paramMb1);
        localObject1 = f();
        paramMb2 = this.S;
        paramMb2 = ((vb)localObject1).a(i8 - paramMb2[0], i9 - paramMb2[1], i7 - paramMb2[0], k - paramMb2[1]);
        paramMb2 = ObjectAnimator.ofPropertyValuesHolder(paramMb1, new PropertyValuesHolder[] { xb.a(L, paramMb2) });
        paramMb2.addListener(new cb(this, paramViewGroup, paramMb1, (View)localObject2, f));
        return paramMb2;
      }
      return null;
    }
    return null;
  }
  
  public void a(Mb paramMb)
  {
    d(paramMb);
  }
  
  public void c(Mb paramMb)
  {
    d(paramMb);
  }
  
  public String[] n()
  {
    return K;
  }
  
  private static class a
  {
    private int a;
    private int b;
    private int c;
    private int d;
    private View e;
    private int f;
    private int g;
    
    a(View paramView)
    {
      this.e = paramView;
    }
    
    private void a()
    {
      _b.a(this.e, this.a, this.b, this.c, this.d);
      this.f = 0;
      this.g = 0;
    }
    
    void a(PointF paramPointF)
    {
      this.c = Math.round(paramPointF.x);
      this.d = Math.round(paramPointF.y);
      this.g += 1;
      if (this.f == this.g) {
        a();
      }
    }
    
    void b(PointF paramPointF)
    {
      this.a = Math.round(paramPointF.x);
      this.b = Math.round(paramPointF.y);
      this.f += 1;
      if (this.f == this.g) {
        a();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */