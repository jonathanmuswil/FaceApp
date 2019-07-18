package android.support.v7.widget;

import Qd;
import Rd;
import Td;
import Ud;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class CardView
  extends FrameLayout
{
  private static final int[] a = { 16842801 };
  private static final S b;
  private boolean c;
  private boolean d;
  int e;
  int f;
  final Rect g = new Rect();
  final Rect h = new Rect();
  private final Q i = new K(this);
  
  static
  {
    int j = Build.VERSION.SDK_INT;
    if (j >= 21) {
      b = new N();
    } else if (j >= 17) {
      b = new M();
    } else {
      b = new P();
    }
    b.a();
  }
  
  public CardView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Qd.cardViewStyle);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, Ud.CardView, paramInt, Td.CardView);
    if (localTypedArray.hasValue(Ud.CardView_cardBackgroundColor)) {}
    for (paramAttributeSet = localTypedArray.getColorStateList(Ud.CardView_cardBackgroundColor);; paramAttributeSet = ColorStateList.valueOf(paramInt))
    {
      break;
      paramAttributeSet = getContext().obtainStyledAttributes(a);
      paramInt = paramAttributeSet.getColor(0, 0);
      paramAttributeSet.recycle();
      paramAttributeSet = new float[3];
      Color.colorToHSV(paramInt, paramAttributeSet);
      if (paramAttributeSet[2] > 0.5F) {
        paramInt = getResources().getColor(Rd.cardview_light_background);
      } else {
        paramInt = getResources().getColor(Rd.cardview_dark_background);
      }
    }
    float f1 = localTypedArray.getDimension(Ud.CardView_cardCornerRadius, 0.0F);
    float f2 = localTypedArray.getDimension(Ud.CardView_cardElevation, 0.0F);
    float f3 = localTypedArray.getDimension(Ud.CardView_cardMaxElevation, 0.0F);
    this.c = localTypedArray.getBoolean(Ud.CardView_cardUseCompatPadding, false);
    this.d = localTypedArray.getBoolean(Ud.CardView_cardPreventCornerOverlap, true);
    paramInt = localTypedArray.getDimensionPixelSize(Ud.CardView_contentPadding, 0);
    this.g.left = localTypedArray.getDimensionPixelSize(Ud.CardView_contentPaddingLeft, paramInt);
    this.g.top = localTypedArray.getDimensionPixelSize(Ud.CardView_contentPaddingTop, paramInt);
    this.g.right = localTypedArray.getDimensionPixelSize(Ud.CardView_contentPaddingRight, paramInt);
    this.g.bottom = localTypedArray.getDimensionPixelSize(Ud.CardView_contentPaddingBottom, paramInt);
    if (f2 > f3) {
      f3 = f2;
    }
    this.e = localTypedArray.getDimensionPixelSize(Ud.CardView_android_minWidth, 0);
    this.f = localTypedArray.getDimensionPixelSize(Ud.CardView_android_minHeight, 0);
    localTypedArray.recycle();
    b.a(this.i, paramContext, paramAttributeSet, f1, f2, f3);
  }
  
  public ColorStateList getCardBackgroundColor()
  {
    return b.e(this.i);
  }
  
  public float getCardElevation()
  {
    return b.d(this.i);
  }
  
  public int getContentPaddingBottom()
  {
    return this.g.bottom;
  }
  
  public int getContentPaddingLeft()
  {
    return this.g.left;
  }
  
  public int getContentPaddingRight()
  {
    return this.g.right;
  }
  
  public int getContentPaddingTop()
  {
    return this.g.top;
  }
  
  public float getMaxCardElevation()
  {
    return b.c(this.i);
  }
  
  public boolean getPreventCornerOverlap()
  {
    return this.d;
  }
  
  public float getRadius()
  {
    return b.f(this.i);
  }
  
  public boolean getUseCompatPadding()
  {
    return this.c;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!(b instanceof N))
    {
      int j = View.MeasureSpec.getMode(paramInt1);
      if ((j == Integer.MIN_VALUE) || (j == 1073741824)) {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(b.g(this.i)), View.MeasureSpec.getSize(paramInt1)), j);
      }
      j = View.MeasureSpec.getMode(paramInt2);
      if ((j == Integer.MIN_VALUE) || (j == 1073741824)) {
        paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(b.a(this.i)), View.MeasureSpec.getSize(paramInt2)), j);
      }
      super.onMeasure(paramInt1, paramInt2);
    }
    else
    {
      super.onMeasure(paramInt1, paramInt2);
    }
  }
  
  public void setCardBackgroundColor(int paramInt)
  {
    b.a(this.i, ColorStateList.valueOf(paramInt));
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList)
  {
    b.a(this.i, paramColorStateList);
  }
  
  public void setCardElevation(float paramFloat)
  {
    b.a(this.i, paramFloat);
  }
  
  public void setMaxCardElevation(float paramFloat)
  {
    b.b(this.i, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt)
  {
    this.f = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt)
  {
    this.e = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean)
  {
    if (paramBoolean != this.d)
    {
      this.d = paramBoolean;
      b.b(this.i);
    }
  }
  
  public void setRadius(float paramFloat)
  {
    b.c(this.i, paramFloat);
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (this.c != paramBoolean)
    {
      this.c = paramBoolean;
      b.h(this.i);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/CardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */