package io.faceapp.ui.image_editor.common.view;

import WVa;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.theartofdev.edmodo.cropper.CropImageView;
import oXa;
import oxa;
import oxa.a;
import oxa.c;
import oya;

public final class CropContentView
  extends CropImageView
  implements ResultingBitmapView.c
{
  private Rect M;
  
  public CropContentView(Context paramContext)
  {
    super(paramContext);
  }
  
  public CropContentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CropContentView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
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
      setImageBitmap((Bitmap)localObject);
      this.M = oya.a((Bitmap)localObject);
    }
    localObject = paramObject;
    if (!(paramObject instanceof WVa)) {
      localObject = null;
    }
    WVa localWVa = (WVa)localObject;
    if (localWVa != null)
    {
      localObject = localWVa.c();
      paramObject = localObject;
      if (!(localObject instanceof Bitmap)) {
        paramObject = null;
      }
      Bitmap localBitmap = (Bitmap)paramObject;
      if (localBitmap != null)
      {
        a(localBitmap);
        localObject = localWVa.d();
        paramObject = localObject;
        if (!(localObject instanceof RectF)) {
          paramObject = null;
        }
        paramObject = (RectF)paramObject;
        if (paramObject != null) {
          setCropRect(oya.b(localBitmap, (RectF)paramObject));
        }
      }
    }
  }
  
  public final a getResultingRect()
  {
    Rect localRect = this.M;
    Object localObject;
    if (localRect != null)
    {
      localObject = getCropRect();
      oXa.a(localObject, "cropRect");
      localObject = new a((Rect)localObject, localRect);
    }
    else
    {
      localObject = null;
    }
    return (a)localObject;
  }
  
  public final void setCropType(oxa paramoxa)
  {
    oXa.b(paramoxa, "cropType");
    if (oXa.a(paramoxa, oxa.c.a))
    {
      paramoxa = this.M;
      if (paramoxa != null)
      {
        setFixedAspectRatio(false);
        setAutoZoomEnabled(false);
        a();
        setCropRect(paramoxa);
        setAutoZoomEnabled(true);
      }
    }
    else if ((paramoxa instanceof oxa.a))
    {
      paramoxa = (oxa.a)paramoxa;
      a(paramoxa.c(), paramoxa.d());
      setFixedAspectRatio(true);
    }
  }
  
  public static final class a
  {
    private final Rect a;
    private final Rect b;
    
    public a(Rect paramRect1, Rect paramRect2)
    {
      this.a = paramRect1;
      this.b = paramRect2;
    }
    
    public final Rect a()
    {
      return this.b;
    }
    
    public final Rect b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public int hashCode()
    {
      Rect localRect = this.a;
      int i = 0;
      int j;
      if (localRect != null) {
        j = localRect.hashCode();
      } else {
        j = 0;
      }
      localRect = this.b;
      if (localRect != null) {
        i = localRect.hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("RectInfo(rect=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", full=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/CropContentView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */