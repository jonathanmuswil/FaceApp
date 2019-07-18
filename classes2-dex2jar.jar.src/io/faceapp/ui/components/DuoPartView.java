package io.faceapp.ui.components;

import Ie;
import QQa;
import UPa;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import java.util.HashMap;
import jta;
import kRa;
import oXa;
import xQa;

public final class DuoPartView
  extends ConstraintLayout
  implements jta<a>
{
  private int u;
  private kRa v;
  private a w;
  private boolean x;
  private boolean y;
  private HashMap z;
  
  public DuoPartView(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    oXa.a(localContext, "context");
    this.u = localContext.getResources().getColor(2131099683);
    this.x = true;
    this.y = true;
    setupView(paramContext);
  }
  
  public DuoPartView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = getContext();
    oXa.a(paramAttributeSet, "context");
    this.u = paramAttributeSet.getResources().getColor(2131099683);
    this.x = true;
    this.y = true;
    setupView(paramContext);
  }
  
  public DuoPartView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = getContext();
    oXa.a(paramAttributeSet, "context");
    this.u = paramAttributeSet.getResources().getColor(2131099683);
    this.x = true;
    this.y = true;
    setupView(paramContext);
  }
  
  private final void a(DuoPartView.a.a parama)
  {
    postDelayed(new j(this), 300L);
    Object localObject = (ImageView)c(io.faceapp.k.plusButton);
    oXa.a(localObject, "plusButton");
    UPa.c((View)localObject);
    localObject = (CircularProgressBar)c(io.faceapp.k.progressView);
    oXa.a(localObject, "progressView");
    UPa.c((View)localObject);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setZoomEnabled(this.x);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setScrollEnabled(this.y);
    a.a(getContext()).a(parama.a()).a(Integer.MIN_VALUE, Integer.MIN_VALUE).a((ScrollZoomImageView)c(io.faceapp.k.imageView));
  }
  
  private final void a(DuoPartView.a.c paramc, boolean paramBoolean)
  {
    setBackgroundColor(this.u);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setImageResource(0);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setZoomEnabled(false);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setScrollEnabled(false);
    Object localObject = (ImageView)c(io.faceapp.k.plusButton);
    oXa.a(localObject, "plusButton");
    UPa.c((View)localObject);
    localObject = (CircularProgressBar)c(io.faceapp.k.progressView);
    oXa.a(localObject, "progressView");
    UPa.e((View)localObject);
    if (paramBoolean) {
      ((CircularProgressBar)c(io.faceapp.k.progressView)).b();
    }
    ((CircularProgressBar)c(io.faceapp.k.progressView)).setProgress(paramc.a());
  }
  
  private final void e()
  {
    setBackgroundColor(this.u);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setImageResource(0);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setZoomEnabled(false);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setScrollEnabled(false);
    Object localObject = (ImageView)c(io.faceapp.k.plusButton);
    oXa.a(localObject, "plusButton");
    UPa.e((View)localObject);
    localObject = (CircularProgressBar)c(io.faceapp.k.progressView);
    oXa.a(localObject, "progressView");
    UPa.c((View)localObject);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493115, this);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setMaxZoomOutEnabled(false);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setMaxZoomIn(10.0F);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setZoomEnabled(this.x);
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setScrollEnabled(this.y);
    if (isInEditMode()) {
      a(new DuoPartView.a.c(0.67F));
    }
  }
  
  public final QQa<Object> a()
  {
    QQa localQQa = ((ScrollZoomImageView)c(io.faceapp.k.imageView)).getClick().e(l.a);
    oXa.a(localQQa, "imageView.click.map { Any() }");
    return localQQa;
  }
  
  public void a(a parama)
  {
    oXa.b(parama, "model");
    kRa localkRa = this.v;
    if (localkRa != null) {
      localkRa.i();
    }
    if (oXa.a(parama, DuoPartView.a.b.a))
    {
      e();
    }
    else if ((parama instanceof DuoPartView.a.c))
    {
      boolean bool;
      if (!(this.w instanceof DuoPartView.a.c)) {
        bool = true;
      } else {
        bool = false;
      }
      a((DuoPartView.a.c)parama, bool);
    }
    else if ((parama instanceof DuoPartView.a.a))
    {
      if (((CircularProgressBar)c(io.faceapp.k.progressView)).getAfterAnimProgress() <= 0.1F)
      {
        a((DuoPartView.a.a)parama);
      }
      else
      {
        if (((CircularProgressBar)c(io.faceapp.k.progressView)).getAfterAnimProgress() < 1.0F) {
          ((CircularProgressBar)c(io.faceapp.k.progressView)).setProgress(1.0F);
        }
        this.v = ((CircularProgressBar)c(io.faceapp.k.progressView)).a().b(new k(this, parama));
      }
    }
    this.w = parama;
  }
  
  public final void b()
  {
    ScrollZoomImageView localScrollZoomImageView = (ScrollZoomImageView)c(io.faceapp.k.imageView);
    oXa.a(localScrollZoomImageView, "imageView");
    localScrollZoomImageView.setScaleX(-1.0F);
  }
  
  public View c(int paramInt)
  {
    if (this.z == null) {
      this.z = new HashMap();
    }
    View localView1 = (View)this.z.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.z.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public final void c()
  {
    this.x = false;
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setZoomEnabled(false);
    this.y = false;
    ((ScrollZoomImageView)c(io.faceapp.k.imageView)).setScrollEnabled(false);
    ScrollZoomImageView localScrollZoomImageView = (ScrollZoomImageView)c(io.faceapp.k.imageView);
    oXa.a(localScrollZoomImageView, "imageView");
    localScrollZoomImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
  }
  
  public final QQa<Matrix> d()
  {
    return ((ScrollZoomImageView)c(io.faceapp.k.imageView)).getMatrixChangedByUser();
  }
  
  protected void onDetachedFromWindow()
  {
    kRa localkRa = this.v;
    if (localkRa != null) {
      localkRa.i();
    }
    this.v = null;
    this.w = null;
    super.onDetachedFromWindow();
  }
  
  public final QQa<Matrix> p()
  {
    return ((ScrollZoomImageView)c(io.faceapp.k.imageView)).getMatrixComputed();
  }
  
  public final void setMatrix(Matrix paramMatrix)
  {
    oXa.b(paramMatrix, "matrix");
    ScrollZoomImageView localScrollZoomImageView = (ScrollZoomImageView)c(io.faceapp.k.imageView);
    oXa.a(localScrollZoomImageView, "imageView");
    localScrollZoomImageView.setImageMatrix(paramMatrix);
  }
  
  public static abstract class a
  {
    public static final class a
      extends DuoPartView.a
    {
      private final Uri a;
      
      public a(Uri paramUri)
      {
        super();
        this.a = paramUri;
      }
      
      public final Uri a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            if (oXa.a(this.a, ((a)paramObject).a)) {}
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
        Uri localUri = this.a;
        int i;
        if (localUri != null) {
          i = localUri.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Content(imageUri=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends DuoPartView.a
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends DuoPartView.a
    {
      private final float a;
      
      public c(float paramFloat)
      {
        super();
        this.a = paramFloat;
      }
      
      public final float a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof c))
          {
            paramObject = (c)paramObject;
            if (Float.compare(this.a, ((c)paramObject).a) == 0) {}
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
        return Float.floatToIntBits(this.a);
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Loading(percent=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/DuoPartView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */