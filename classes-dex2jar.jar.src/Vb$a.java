import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.y;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

class Vb$a
  extends ViewGroup
{
  static Method a;
  ViewGroup b;
  View c;
  ArrayList<Drawable> d = null;
  Vb e;
  
  static
  {
    try
    {
      a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[] { Integer.TYPE, Integer.TYPE, Rect.class });
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  Vb$a(Context paramContext, ViewGroup paramViewGroup, View paramView, Vb paramVb)
  {
    super(paramContext);
    this.b = paramViewGroup;
    this.c = paramView;
    setRight(paramViewGroup.getWidth());
    setBottom(paramViewGroup.getHeight());
    paramViewGroup.addView(this);
    this.e = paramVb;
  }
  
  private void a(int[] paramArrayOfInt)
  {
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    this.b.getLocationOnScreen(arrayOfInt1);
    this.c.getLocationOnScreen(arrayOfInt2);
    arrayOfInt2[0] -= arrayOfInt1[0];
    arrayOfInt2[1] -= arrayOfInt1[1];
  }
  
  public void a(Drawable paramDrawable)
  {
    if (this.d == null) {
      this.d = new ArrayList();
    }
    if (!this.d.contains(paramDrawable))
    {
      this.d.add(paramDrawable);
      invalidate(paramDrawable.getBounds());
      paramDrawable.setCallback(this);
    }
  }
  
  public void a(View paramView)
  {
    if ((paramView.getParent() instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
      if ((localViewGroup != this.b) && (localViewGroup.getParent() != null) && (y.A(localViewGroup)))
      {
        int[] arrayOfInt1 = new int[2];
        int[] arrayOfInt2 = new int[2];
        localViewGroup.getLocationOnScreen(arrayOfInt1);
        this.b.getLocationOnScreen(arrayOfInt2);
        y.a(paramView, arrayOfInt1[0] - arrayOfInt2[0]);
        y.b(paramView, arrayOfInt1[1] - arrayOfInt2[1]);
      }
      localViewGroup.removeView(paramView);
      if (paramView.getParent() != null) {
        localViewGroup.removeView(paramView);
      }
    }
    super.addView(paramView, getChildCount() - 1);
  }
  
  boolean a()
  {
    if (getChildCount() == 0)
    {
      ArrayList localArrayList = this.d;
      if ((localArrayList == null) || (localArrayList.size() == 0)) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void b(Drawable paramDrawable)
  {
    ArrayList localArrayList = this.d;
    if (localArrayList != null)
    {
      localArrayList.remove(paramDrawable);
      invalidate(paramDrawable.getBounds());
      paramDrawable.setCallback(null);
    }
  }
  
  public void b(View paramView)
  {
    super.removeView(paramView);
    if (a()) {
      this.b.removeView(this);
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    Object localObject = new int[2];
    int[] arrayOfInt = new int[2];
    this.b.getLocationOnScreen((int[])localObject);
    this.c.getLocationOnScreen(arrayOfInt);
    int i = 0;
    paramCanvas.translate(arrayOfInt[0] - localObject[0], arrayOfInt[1] - localObject[1]);
    paramCanvas.clipRect(new Rect(0, 0, this.c.getWidth(), this.c.getHeight()));
    super.dispatchDraw(paramCanvas);
    localObject = this.d;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((ArrayList)localObject).size();
    }
    while (i < j)
    {
      ((Drawable)this.d.get(i)).draw(paramCanvas);
      i++;
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public ViewParent invalidateChildInParent(int[] paramArrayOfInt, Rect paramRect)
  {
    if (this.b != null)
    {
      paramRect.offset(paramArrayOfInt[0], paramArrayOfInt[1]);
      if ((this.b instanceof ViewGroup))
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
        int[] arrayOfInt = new int[2];
        a(arrayOfInt);
        paramRect.offset(arrayOfInt[0], arrayOfInt[1]);
        return super.invalidateChildInParent(paramArrayOfInt, paramRect);
      }
      invalidate(paramRect);
    }
    return null;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidate(paramDrawable.getBounds());
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if (!super.verifyDrawable(paramDrawable))
    {
      ArrayList localArrayList = this.d;
      if ((localArrayList == null) || (!localArrayList.contains(paramDrawable))) {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Vb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */