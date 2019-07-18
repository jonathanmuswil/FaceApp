package io.faceapp.ui.components;

import APa;
import KOa;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public final class Watermark
  extends AppCompatImageView
{
  private static final float c = 0.25F;
  private static final float d = 0.06F;
  private static final float e = 0.021F;
  public static final a f = new a(null);
  private int g = -1;
  
  public Watermark(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Watermark(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public Watermark(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    setImageResource(2131231104);
    setScaleType(ImageView.ScaleType.FIT_CENTER);
    this.g = KOa.b.b(paramContext).c();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = this.g;
    paramInt2 = (int)(i * c);
    paramInt1 = (int)(i * d);
    i = (int)(i * e);
    setPadding(0, 0, i, i);
    setMeasuredDimension(paramInt2 + i, paramInt1 + i);
  }
  
  public final void setContainerWidth(int paramInt)
  {
    this.g = paramInt;
    invalidate();
  }
  
  public static final class a
  {
    public final float a()
    {
      return Watermark.a();
    }
    
    public final float b()
    {
      return Watermark.b();
    }
    
    public final float c()
    {
      return Watermark.c();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/Watermark.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */