package io.faceapp.ui.layouts.modes.item;

import FVa;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.ImageView;
import oXa;

public final class DragHandle
  extends AppCompatImageView
{
  private int c;
  private int d;
  private float e;
  private final FVa<Integer> f;
  
  public DragHandle(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = FVa.t();
    oXa.a(paramContext, "BehaviorSubject.create()");
    this.f = paramContext;
    setImageResource(2131230986);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final FVa<Integer> getPosition()
  {
    return this.f;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    oXa.b(paramCanvas, "canvas");
    paramCanvas.save();
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    getDrawable().draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    oXa.b(paramMotionEvent, "event");
    int i = paramMotionEvent.getAction();
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          if (i != 3) {
            break label122;
          }
        }
        else
        {
          i = (int)(this.e + paramMotionEvent.getRawY());
          i = Math.min(this.d, Math.max(this.c, i));
          this.f.a(Integer.valueOf(i));
          break label122;
        }
      }
      paramMotionEvent = getParent();
      if (paramMotionEvent != null) {
        paramMotionEvent.requestDisallowInterceptTouchEvent(false);
      }
    }
    else
    {
      ViewParent localViewParent = getParent();
      if (localViewParent != null) {
        localViewParent.requestDisallowInterceptTouchEvent(true);
      }
      this.e = (getY() - paramMotionEvent.getRawY());
    }
    label122:
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/modes/item/DragHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */