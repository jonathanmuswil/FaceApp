package android.support.design.widget;

import android.support.v4.view.y;
import android.support.v4.widget.H;
import android.support.v4.widget.H.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class SwipeDismissBehavior<V extends View>
  extends CoordinatorLayout.b<V>
{
  H a;
  a b;
  private boolean c;
  private float d = 0.0F;
  private boolean e;
  int f = 2;
  float g = 0.5F;
  float h = 0.0F;
  float i = 0.5F;
  private final H.a j = new S(this);
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.min(Math.max(paramFloat1, paramFloat2), paramFloat3);
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  private void a(ViewGroup paramViewGroup)
  {
    if (this.a == null)
    {
      if (this.e) {
        paramViewGroup = H.a(paramViewGroup, this.d, this.j);
      } else {
        paramViewGroup = H.a(paramViewGroup, this.j);
      }
      this.a = paramViewGroup;
    }
  }
  
  static float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat3 - paramFloat1) / (paramFloat2 - paramFloat1);
  }
  
  public void a(float paramFloat)
  {
    this.i = a(0.0F, paramFloat, 1.0F);
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool = this.c;
    int k = paramMotionEvent.getActionMasked();
    if (k != 0)
    {
      if ((k == 1) || (k == 3)) {
        this.c = false;
      }
    }
    else
    {
      this.c = paramCoordinatorLayout.a(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      bool = this.c;
    }
    if (bool)
    {
      a(paramCoordinatorLayout);
      return this.a.b(paramMotionEvent);
    }
    return false;
  }
  
  public boolean a(View paramView)
  {
    return true;
  }
  
  public void b(float paramFloat)
  {
    this.h = a(0.0F, paramFloat, 1.0F);
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    paramCoordinatorLayout = this.a;
    if (paramCoordinatorLayout != null)
    {
      paramCoordinatorLayout.a(paramMotionEvent);
      return true;
    }
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
    
    public abstract void a(View paramView);
  }
  
  private class b
    implements Runnable
  {
    private final View a;
    private final boolean b;
    
    b(View paramView, boolean paramBoolean)
    {
      this.a = paramView;
      this.b = paramBoolean;
    }
    
    public void run()
    {
      Object localObject = SwipeDismissBehavior.this.a;
      if ((localObject != null) && (((H)localObject).a(true)))
      {
        y.a(this.a, this);
      }
      else if (this.b)
      {
        localObject = SwipeDismissBehavior.this.b;
        if (localObject != null) {
          ((SwipeDismissBehavior.a)localObject).a(this.a);
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/SwipeDismissBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */