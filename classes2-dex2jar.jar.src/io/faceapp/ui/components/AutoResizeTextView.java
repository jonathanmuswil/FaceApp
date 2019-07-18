package io.faceapp.ui.components;

import android.content.Context;
import android.support.v7.widget.I;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

public class AutoResizeTextView
  extends I
{
  private a d;
  private boolean e = false;
  private float f = getTextSize();
  private float g = 0.0F;
  private float h = 12.0F;
  private float i = 1.0F;
  private float j = 0.0F;
  private boolean k = true;
  
  public AutoResizeTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AutoResizeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AutoResizeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int a(CharSequence paramCharSequence, TextPaint paramTextPaint, int paramInt, float paramFloat)
  {
    paramTextPaint = new TextPaint(paramTextPaint);
    paramTextPaint.setTextSize(paramFloat);
    return new StaticLayout(paramCharSequence, paramTextPaint, paramInt, Layout.Alignment.ALIGN_NORMAL, this.i, this.j, getIncludeFontPadding()).getHeight();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    Object localObject1 = getText();
    if ((localObject1 != null) && (((CharSequence)localObject1).length() != 0) && (paramInt2 > 0) && (paramInt1 > 0) && (this.f != 0.0F))
    {
      Object localObject2 = localObject1;
      if (getTransformationMethod() != null) {
        localObject2 = getTransformationMethod().getTransformation((CharSequence)localObject1, this);
      }
      TextPaint localTextPaint = getPaint();
      float f1 = localTextPaint.getTextSize();
      float f2 = this.g;
      if (f2 > 0.0F) {
        f2 = Math.min(this.f, f2);
      } else {
        f2 = this.f;
      }
      float f3;
      for (int m = a((CharSequence)localObject2, localTextPaint, paramInt1, f2); m > paramInt2; m = a((CharSequence)localObject2, localTextPaint, paramInt1, f2))
      {
        f3 = this.h;
        if (f2 <= f3) {
          break;
        }
        f2 = Math.max(f2 - 2.0F, f3);
      }
      if ((this.k) && (f2 == this.h) && (m > paramInt2))
      {
        localObject1 = new StaticLayout((CharSequence)localObject2, new TextPaint(localTextPaint), paramInt1, Layout.Alignment.ALIGN_NORMAL, this.i, this.j, false);
        if (((StaticLayout)localObject1).getLineCount() > 0)
        {
          int n = ((StaticLayout)localObject1).getLineForVertical(paramInt2) - 1;
          if (n < 0)
          {
            setText("");
          }
          else
          {
            m = ((StaticLayout)localObject1).getLineStart(n);
            paramInt2 = ((StaticLayout)localObject1).getLineEnd(n);
            f3 = ((StaticLayout)localObject1).getLineWidth(n);
            float f4 = localTextPaint.measureText("...");
            while (paramInt1 < f3 + f4)
            {
              paramInt2--;
              f3 = localTextPaint.measureText(((CharSequence)localObject2).subSequence(m, paramInt2 + 1).toString());
            }
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append(((CharSequence)localObject2).subSequence(0, paramInt2));
            ((StringBuilder)localObject1).append("...");
            setText(((StringBuilder)localObject1).toString());
          }
        }
      }
      setTextSize(0, f2);
      setLineSpacing(this.j, this.i);
      localObject2 = this.d;
      if (localObject2 != null) {
        ((a)localObject2).a(this, f1, f2);
      }
      this.e = false;
    }
  }
  
  public boolean getAddEllipsis()
  {
    return this.k;
  }
  
  public float getMaxTextSize()
  {
    return this.g;
  }
  
  public float getMinTextSize()
  {
    return this.h;
  }
  
  public void ha()
  {
    float f1 = this.f;
    if (f1 > 0.0F)
    {
      super.setTextSize(0, f1);
      this.g = this.f;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramBoolean) || (this.e)) {
      a(paramInt3 - paramInt1 - getCompoundPaddingLeft() - getCompoundPaddingRight(), paramInt4 - paramInt2 - getCompoundPaddingBottom() - getCompoundPaddingTop());
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      this.e = true;
    }
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.e = true;
    ha();
  }
  
  public void setAddEllipsis(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public void setLineSpacing(float paramFloat1, float paramFloat2)
  {
    super.setLineSpacing(paramFloat1, paramFloat2);
    this.i = paramFloat2;
    this.j = paramFloat1;
  }
  
  public void setMaxTextSize(float paramFloat)
  {
    this.g = paramFloat;
    requestLayout();
    invalidate();
  }
  
  public void setMinTextSize(float paramFloat)
  {
    this.h = paramFloat;
    requestLayout();
    invalidate();
  }
  
  public void setOnResizeListener(a parama)
  {
    this.d = parama;
  }
  
  public void setTextSize(float paramFloat)
  {
    super.setTextSize(paramFloat);
    this.f = getTextSize();
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    super.setTextSize(paramInt, paramFloat);
    this.f = getTextSize();
  }
  
  public static abstract interface a
  {
    public abstract void a(TextView paramTextView, float paramFloat1, float paramFloat2);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/AutoResizeTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */