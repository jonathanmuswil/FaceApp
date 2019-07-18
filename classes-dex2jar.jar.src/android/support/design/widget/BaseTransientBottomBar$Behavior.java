package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

public class BaseTransientBottomBar$Behavior
  extends SwipeDismissBehavior<View>
{
  private final d k = new d(this);
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    this.k.a(paramCoordinatorLayout, paramView, paramMotionEvent);
    return super.a(paramCoordinatorLayout, paramView, paramMotionEvent);
  }
  
  public boolean a(View paramView)
  {
    return this.k.a(paramView);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/BaseTransientBottomBar$Behavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */