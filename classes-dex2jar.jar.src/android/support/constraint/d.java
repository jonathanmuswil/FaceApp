package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

public class d
  extends ViewGroup
{
  c a;
  
  protected a generateDefaultLayoutParams()
  {
    return new a(-2, -2);
  }
  
  public a generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new a(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new ConstraintLayout.a(paramLayoutParams);
  }
  
  public c getConstraintSet()
  {
    if (this.a == null) {
      this.a = new c();
    }
    this.a.a(this);
    return this.a;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public static class a
    extends ConstraintLayout.a
  {
    public float na = 1.0F;
    public boolean oa;
    public float pa;
    public float qa;
    public float ra;
    public float sa;
    public float ta;
    public float ua;
    public float va;
    public float wa;
    public float xa;
    public float ya;
    public float za;
    
    public a(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      this.oa = false;
      this.pa = 0.0F;
      this.qa = 0.0F;
      this.ra = 0.0F;
      this.sa = 0.0F;
      this.ta = 1.0F;
      this.ua = 1.0F;
      this.va = 0.0F;
      this.wa = 0.0F;
      this.xa = 0.0F;
      this.ya = 0.0F;
      this.za = 0.0F;
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      int i = 0;
      this.oa = false;
      this.pa = 0.0F;
      this.qa = 0.0F;
      this.ra = 0.0F;
      this.sa = 0.0F;
      this.ta = 1.0F;
      this.ua = 1.0F;
      this.va = 0.0F;
      this.wa = 0.0F;
      this.xa = 0.0F;
      this.ya = 0.0F;
      this.za = 0.0F;
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, g.ConstraintSet);
      int j = paramContext.getIndexCount();
      while (i < j)
      {
        int k = paramContext.getIndex(i);
        if (k == g.ConstraintSet_android_alpha)
        {
          this.na = paramContext.getFloat(k, this.na);
        }
        else if (k == g.ConstraintSet_android_elevation)
        {
          this.pa = paramContext.getFloat(k, this.pa);
          this.oa = true;
        }
        else if (k == g.ConstraintSet_android_rotationX)
        {
          this.ra = paramContext.getFloat(k, this.ra);
        }
        else if (k == g.ConstraintSet_android_rotationY)
        {
          this.sa = paramContext.getFloat(k, this.sa);
        }
        else if (k == g.ConstraintSet_android_rotation)
        {
          this.qa = paramContext.getFloat(k, this.qa);
        }
        else if (k == g.ConstraintSet_android_scaleX)
        {
          this.ta = paramContext.getFloat(k, this.ta);
        }
        else if (k == g.ConstraintSet_android_scaleY)
        {
          this.ua = paramContext.getFloat(k, this.ua);
        }
        else if (k == g.ConstraintSet_android_transformPivotX)
        {
          this.va = paramContext.getFloat(k, this.va);
        }
        else if (k == g.ConstraintSet_android_transformPivotY)
        {
          this.wa = paramContext.getFloat(k, this.wa);
        }
        else if (k == g.ConstraintSet_android_translationX)
        {
          this.xa = paramContext.getFloat(k, this.xa);
        }
        else if (k == g.ConstraintSet_android_translationY)
        {
          this.ya = paramContext.getFloat(k, this.ya);
        }
        else if (k == g.ConstraintSet_android_translationZ)
        {
          this.xa = paramContext.getFloat(k, this.za);
        }
        i++;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/constraint/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */