package io.faceapp.ui.image_editor.common.view;

import APa;
import QQa;
import WOa;
import WOa.b;
import _Va;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import io.faceapp.ui.components.ImageDisplay;
import java.io.File;
import oXa;
import vka;

public final class ScrollableContentView
  extends ImageDisplay
  implements ResultingBitmapView.c, ResultingBitmapView.a
{
  private APa j;
  private vka k;
  private Matrix l;
  private ViewTreeObserver.OnPreDrawListener m;
  
  public ScrollableContentView(Context paramContext)
  {
    super(paramContext);
    c();
  }
  
  public ScrollableContentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
  }
  
  public ScrollableContentView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c();
  }
  
  private final Matrix a(APa paramAPa1, APa paramAPa2, vka paramvka)
  {
    boolean bool;
    if (paramAPa1.c() >= paramAPa1.b()) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool) {
      paramvka = null;
    }
    return WOa.e.a(paramAPa1, paramAPa2, paramvka, bool);
  }
  
  private final void c()
  {
    o localo = new o(this);
    this.m = localo;
    getViewTreeObserver().addOnPreDrawListener(localo);
  }
  
  public final void a(Matrix paramMatrix, vka paramvka)
  {
    oXa.b(paramvka, "primaryFace");
    this.l = paramMatrix;
    this.k = paramvka;
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
      this.j = new APa(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      setImage((Bitmap)localObject);
    }
    localObject = paramObject;
    if (!(paramObject instanceof File)) {
      localObject = null;
    }
    paramObject = (File)localObject;
    if (paramObject != null)
    {
      paramObject = WOa.a(WOa.e, new WOa.b((File)paramObject), 0, 0, false, 14, null);
      if (paramObject != null) {
        a(paramObject);
      }
    }
  }
  
  public QQa<Boolean> getBeforeAfterSub()
  {
    return getOriginalWanted();
  }
  
  public final Bitmap getResultingBitmap()
  {
    Object localObject = getImageDrawable();
    if (localObject != null)
    {
      localObject = ((BitmapDrawable)localObject).getBitmap();
      oXa.a(localObject, "(getImageDrawable() as BitmapDrawable).bitmap");
      return (Bitmap)localObject;
    }
    throw new _Va("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
  }
  
  protected void onDetachedFromWindow()
  {
    getViewTreeObserver().removeOnPreDrawListener(this.m);
    this.m = null;
    super.onDetachedFromWindow();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/ScrollableContentView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */