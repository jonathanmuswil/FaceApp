package io.faceapp.ui.image_editor.common.view;

import QQa;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.faceapp.ui.components.ScrollZoomImageView;
import oXa;
import rCa.a.a;

public final class CombinedContentView
  extends ViewGroup
  implements ResultingBitmapView.c, ResultingBitmapView.a
{
  private Bitmap a;
  private Bitmap b;
  private ImageView c;
  private ImageView d;
  private ScrollZoomImageView e;
  private int f;
  private int g;
  private int h;
  private int i;
  
  public CombinedContentView(Context paramContext)
  {
    this(paramContext, null, 0, 6, null);
  }
  
  public CombinedContentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0, 4, null);
  }
  
  public CombinedContentView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(Object paramObject)
  {
    oXa.b(paramObject, "content");
    if (!(paramObject instanceof Bitmap)) {
      localObject = null;
    } else {
      localObject = paramObject;
    }
    Object localObject = (Bitmap)localObject;
    if (localObject != null)
    {
      this.a = ((Bitmap)localObject);
      this.b = null;
      localObject = this.c;
      if (localObject != null)
      {
        ((ImageView)localObject).setImageBitmap(this.a);
        localObject = this.c;
        if (localObject != null)
        {
          ((ImageView)localObject).setVisibility(0);
          localObject = this.d;
          if (localObject != null)
          {
            ((ImageView)localObject).setVisibility(4);
            localObject = this.e;
            if (localObject != null)
            {
              ((ImageView)localObject).setVisibility(4);
              requestLayout();
            }
            else
            {
              oXa.b("bgView");
              throw null;
            }
          }
          else
          {
            oXa.b("mgView");
            throw null;
          }
        }
        else
        {
          oXa.b("fgView");
          throw null;
        }
      }
      else
      {
        oXa.b("fgView");
        throw null;
      }
    }
    localObject = paramObject;
    if (!(paramObject instanceof rCa.a.a)) {
      localObject = null;
    }
    paramObject = (rCa.a.a)localObject;
    if (paramObject != null)
    {
      this.a = ((rCa.a.a)paramObject).b();
      this.b = ((rCa.a.a)paramObject).a();
      localObject = this.c;
      if (localObject != null)
      {
        ((ImageView)localObject).setImageBitmap(this.a);
        localObject = this.c;
        if (localObject != null)
        {
          ((ImageView)localObject).setVisibility(0);
          boolean bool = ((rCa.a.a)paramObject).c();
          if (bool == true)
          {
            paramObject = this.d;
            if (paramObject != null)
            {
              ((ImageView)paramObject).setImageBitmap(this.b);
              paramObject = this.d;
              if (paramObject != null)
              {
                ((ImageView)paramObject).setVisibility(0);
                paramObject = this.e;
                if (paramObject != null)
                {
                  ((ImageView)paramObject).setVisibility(4);
                }
                else
                {
                  oXa.b("bgView");
                  throw null;
                }
              }
              else
              {
                oXa.b("mgView");
                throw null;
              }
            }
            else
            {
              oXa.b("mgView");
              throw null;
            }
          }
          else if (!bool)
          {
            paramObject = this.e;
            if (paramObject != null)
            {
              ((ScrollZoomImageView)paramObject).setImageBitmap(this.b);
              paramObject = this.e;
              if (paramObject != null)
              {
                ((ImageView)paramObject).setVisibility(0);
                paramObject = this.d;
                if (paramObject != null)
                {
                  ((ImageView)paramObject).setVisibility(4);
                }
                else
                {
                  oXa.b("mgView");
                  throw null;
                }
              }
              else
              {
                oXa.b("bgView");
                throw null;
              }
            }
            else
            {
              oXa.b("bgView");
              throw null;
            }
          }
          requestLayout();
        }
        else
        {
          oXa.b("fgView");
          throw null;
        }
      }
      else
      {
        oXa.b("fgView");
        throw null;
      }
    }
  }
  
  public final RectF getBackgroundRect()
  {
    Object localObject1 = this.b;
    if (localObject1 != null)
    {
      Object localObject2 = new float[9];
      ScrollZoomImageView localScrollZoomImageView = this.e;
      if (localScrollZoomImageView != null)
      {
        localScrollZoomImageView.getImageMatrix().getValues((float[])localObject2);
        float f1 = localObject2[0];
        float f2 = localObject2[2];
        float f3 = localObject2[5];
        localObject2 = this.e;
        if (localObject2 != null)
        {
          float f4 = ((ImageView)localObject2).getWidth() / f1 / ((Bitmap)localObject1).getWidth();
          localObject2 = this.e;
          if (localObject2 != null)
          {
            float f5 = ((ImageView)localObject2).getHeight() / f1 / ((Bitmap)localObject1).getHeight();
            f2 = -f2 / f1 / ((Bitmap)localObject1).getWidth();
            f1 = -f3 / f1 / ((Bitmap)localObject1).getHeight();
            localObject1 = new RectF(f2, f1, f4 + f2, f5 + f1);
          }
          else
          {
            oXa.b("bgView");
            throw null;
          }
        }
        else
        {
          oXa.b("bgView");
          throw null;
        }
      }
      else
      {
        oXa.b("bgView");
        throw null;
      }
    }
    else
    {
      localObject1 = null;
    }
    return (RectF)localObject1;
  }
  
  public QQa<Boolean> getBeforeAfterSub()
  {
    Object localObject = this.e;
    if (localObject != null)
    {
      localObject = ((ScrollZoomImageView)localObject).getLongPress().e();
      oXa.a(localObject, "bgView.longPress.distinctUntilChanged()");
      return (QQa<Boolean>)localObject;
    }
    oXa.b("bgView");
    throw null;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    Object localObject = findViewById(2131296570);
    oXa.a(localObject, "findViewById(R.id.foregroundView)");
    this.c = ((ImageView)localObject);
    localObject = findViewById(2131296668);
    oXa.a(localObject, "findViewById(R.id.midgroundView)");
    this.d = ((ImageView)localObject);
    localObject = findViewById(2131296329);
    oXa.a(localObject, "findViewById(R.id.backgroundView)");
    this.e = ((ScrollZoomImageView)localObject);
    localObject = this.e;
    if (localObject != null)
    {
      ((ScrollZoomImageView)localObject).setMaxZoomOutEnabled(false);
      localObject = this.e;
      if (localObject != null)
      {
        ((ScrollZoomImageView)localObject).setMaxZoomIn(4.0F);
        return;
      }
      oXa.b("bgView");
      throw null;
    }
    oXa.b("bgView");
    throw null;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      paramInt3 = this.i;
      paramInt4 = this.h;
      localView.layout(paramInt3, paramInt4, this.f + paramInt3, this.g + paramInt4);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 0;
    int k = View.getDefaultSize(0, paramInt1);
    paramInt2 = View.getDefaultSize(0, paramInt2);
    this.f = k;
    this.g = paramInt2;
    Bitmap localBitmap = this.a;
    if (localBitmap != null)
    {
      paramInt1 = localBitmap.getWidth() * paramInt2 / localBitmap.getHeight();
      m = localBitmap.getHeight() * k / localBitmap.getWidth();
      if (m <= paramInt2)
      {
        this.f = k;
        this.g = m;
      }
      else if (paramInt1 <= k)
      {
        this.f = paramInt1;
        this.g = paramInt2;
      }
    }
    this.h = ((paramInt2 - this.g) / 2);
    this.i = ((k - this.f) / 2);
    int m = getChildCount();
    for (paramInt1 = j; paramInt1 < m; paramInt1++)
    {
      int n = View.MeasureSpec.makeMeasureSpec(this.f, 1073741824);
      j = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
      getChildAt(paramInt1).measure(n, j);
    }
    setMeasuredDimension(k, paramInt2);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/CombinedContentView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */