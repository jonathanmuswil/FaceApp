package android.support.v7.widget;

import Pd;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
  extends View
{
  private int a = 0;
  private int b;
  private WeakReference<View> c;
  private LayoutInflater d;
  private a e;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Pd.ViewStubCompat, paramInt, 0);
    this.b = paramContext.getResourceId(Pd.ViewStubCompat_android_inflatedId, -1);
    this.a = paramContext.getResourceId(Pd.ViewStubCompat_android_layout, 0);
    setId(paramContext.getResourceId(Pd.ViewStubCompat_android_id, -1));
    paramContext.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public View a()
  {
    Object localObject1 = getParent();
    if ((localObject1 != null) && ((localObject1 instanceof ViewGroup)))
    {
      if (this.a != 0)
      {
        Object localObject2 = (ViewGroup)localObject1;
        localObject1 = this.d;
        if (localObject1 == null) {
          localObject1 = LayoutInflater.from(getContext());
        }
        localObject1 = ((LayoutInflater)localObject1).inflate(this.a, (ViewGroup)localObject2, false);
        int i = this.b;
        if (i != -1) {
          ((View)localObject1).setId(i);
        }
        i = ((ViewGroup)localObject2).indexOfChild(this);
        ((ViewGroup)localObject2).removeViewInLayout(this);
        ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
        if (localLayoutParams != null) {
          ((ViewGroup)localObject2).addView((View)localObject1, i, localLayoutParams);
        } else {
          ((ViewGroup)localObject2).addView((View)localObject1, i);
        }
        this.c = new WeakReference(localObject1);
        localObject2 = this.e;
        if (localObject2 != null) {
          ((a)localObject2).a(this, (View)localObject1);
        }
        return (View)localObject1;
      }
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {}
  
  @SuppressLint({"MissingSuperCall"})
  public void draw(Canvas paramCanvas) {}
  
  public int getInflatedId()
  {
    return this.b;
  }
  
  public LayoutInflater getLayoutInflater()
  {
    return this.d;
  }
  
  public int getLayoutResource()
  {
    return this.a;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void setInflatedId(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void setLayoutInflater(LayoutInflater paramLayoutInflater)
  {
    this.d = paramLayoutInflater;
  }
  
  public void setLayoutResource(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void setOnInflateListener(a parama)
  {
    this.e = parama;
  }
  
  public void setVisibility(int paramInt)
  {
    Object localObject = this.c;
    if (localObject != null)
    {
      localObject = (View)((WeakReference)localObject).get();
      if (localObject != null) {
        ((View)localObject).setVisibility(paramInt);
      } else {
        throw new IllegalStateException("setVisibility called on un-referenced view");
      }
    }
    else
    {
      super.setVisibility(paramInt);
      if ((paramInt == 0) || (paramInt == 4)) {
        a();
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(ViewStubCompat paramViewStubCompat, View paramView);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ViewStubCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */