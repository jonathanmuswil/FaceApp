package io.faceapp.ui.components;

import FVa;
import Ie;
import QQa;
import UPa;
import XQa;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import java.util.HashMap;
import jta;
import kRa;
import oXa;
import xQa;

public final class CollagePartView
  extends ConstraintLayout
  implements jta<b>
{
  private static final CollagePartView.c.b u = CollagePartView.c.b.d;
  public static final a v = new a(null);
  private c A;
  private HashMap B;
  private int w = -1;
  private kRa x;
  private b y;
  private final FVa<Boolean> z;
  
  public CollagePartView(Context paramContext)
  {
    super(paramContext);
    FVa localFVa = FVa.t();
    oXa.a(localFVa, "BehaviorSubject.create()");
    this.z = localFVa;
    this.A = u;
    setupView(paramContext);
  }
  
  public CollagePartView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = FVa.t();
    oXa.a(paramAttributeSet, "BehaviorSubject.create()");
    this.z = paramAttributeSet;
    this.A = u;
    setupView(paramContext);
  }
  
  public CollagePartView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = FVa.t();
    oXa.a(paramAttributeSet, "BehaviorSubject.create()");
    this.z = paramAttributeSet;
    this.A = u;
    setupView(paramContext);
  }
  
  private final void a(CollagePartView.b.a parama)
  {
    setBackgroundColor(0);
    Object localObject = (ImageView)c(k.plusButton);
    oXa.a(localObject, "plusButton");
    UPa.c((View)localObject);
    localObject = (CircularProgressBar)c(k.progressView);
    oXa.a(localObject, "progressView");
    UPa.c((View)localObject);
    a.a(getContext()).a(parama.b()).a(new ColorDrawable(this.w)).a((ImageView)c(k.imageView));
    parama = parama.a();
    if (parama != null)
    {
      localObject = (TextView)c(k.labelView);
      oXa.a(localObject, "labelView");
      UPa.e((View)localObject);
      localObject = (TextView)c(k.labelView);
      oXa.a(localObject, "labelView");
      ((TextView)localObject).setText(parama);
    }
    else
    {
      parama = (TextView)c(k.labelView);
      oXa.a(parama, "labelView");
      UPa.c(parama);
    }
    this.z.a(Boolean.valueOf(true));
  }
  
  private final void a(CollagePartView.b.c paramc, boolean paramBoolean)
  {
    setBackgroundColor(this.w);
    ((ImageView)c(k.imageView)).setImageResource(0);
    Object localObject = (ImageView)c(k.plusButton);
    oXa.a(localObject, "plusButton");
    UPa.c((View)localObject);
    localObject = (CircularProgressBar)c(k.progressView);
    oXa.a(localObject, "progressView");
    UPa.e((View)localObject);
    localObject = (TextView)c(k.labelView);
    oXa.a(localObject, "labelView");
    UPa.c((View)localObject);
    if (paramBoolean) {
      ((CircularProgressBar)c(k.progressView)).b();
    }
    ((CircularProgressBar)c(k.progressView)).setProgress(paramc.a());
    this.z.a(Boolean.valueOf(false));
  }
  
  private final void a(c paramc)
  {
    Context localContext = getContext();
    oXa.a(localContext, "context");
    this.w = localContext.getResources().getColor(paramc.b());
    setBackgroundColor(this.w);
    ((ImageView)c(k.plusButton)).setImageResource(paramc.c());
    c(k.viewBorder).setBackgroundResource(paramc.a());
  }
  
  private final void d()
  {
    setBackgroundColor(this.w);
    ((ImageView)c(k.imageView)).setImageResource(0);
    Object localObject = (ImageView)c(k.plusButton);
    oXa.a(localObject, "plusButton");
    UPa.e((View)localObject);
    localObject = (CircularProgressBar)c(k.progressView);
    oXa.a(localObject, "progressView");
    UPa.c((View)localObject);
    localObject = (TextView)c(k.labelView);
    oXa.a(localObject, "labelView");
    UPa.c((View)localObject);
    this.z.a(Boolean.valueOf(false));
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493113, this);
    if (isInEditMode())
    {
      a(new CollagePartView.b.c(0.67F));
      setBackgroundColor(getResources().getColor(17170456));
    }
  }
  
  public final xQa a()
  {
    xQa localxQa;
    if (oXa.a((Boolean)this.z.u(), Boolean.valueOf(true)))
    {
      localxQa = xQa.e();
      oXa.a(localxQa, "Completable.complete()");
    }
    else
    {
      localxQa = this.z.a(i.a).h().d();
      oXa.a(localxQa, "contentBound.filter { it…OrError().ignoreElement()");
    }
    return localxQa;
  }
  
  public void a(b paramb)
  {
    oXa.b(paramb, "model");
    kRa localkRa = this.x;
    if (localkRa != null) {
      localkRa.i();
    }
    if (oXa.a(paramb, CollagePartView.b.b.a))
    {
      d();
    }
    else if ((paramb instanceof CollagePartView.b.c))
    {
      boolean bool;
      if (!(this.y instanceof CollagePartView.b.c)) {
        bool = true;
      } else {
        bool = false;
      }
      a((CollagePartView.b.c)paramb, bool);
    }
    else if ((paramb instanceof CollagePartView.b.a))
    {
      if (((CircularProgressBar)c(k.progressView)).getAfterAnimProgress() <= 0.1F)
      {
        a((CollagePartView.b.a)paramb);
      }
      else
      {
        if (((CircularProgressBar)c(k.progressView)).getAfterAnimProgress() < 1.0F) {
          ((CircularProgressBar)c(k.progressView)).setProgress(1.0F);
        }
        this.x = ((CircularProgressBar)c(k.progressView)).a().b(new h(this, paramb));
      }
    }
    this.y = paramb;
  }
  
  public View c(int paramInt)
  {
    if (this.B == null) {
      this.B = new HashMap();
    }
    View localView1 = (View)this.B.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.B.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  protected void onDetachedFromWindow()
  {
    kRa localkRa = this.x;
    if (localkRa != null) {
      localkRa.i();
    }
    this.x = null;
    this.y = null;
    super.onDetachedFromWindow();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (this.w == -1) {
      a(this.A);
    }
  }
  
  public final void setScaleType(ImageView.ScaleType paramScaleType)
  {
    oXa.b(paramScaleType, "scaleType");
    ImageView localImageView = (ImageView)c(k.imageView);
    oXa.a(localImageView, "imageView");
    localImageView.setScaleType(paramScaleType);
  }
  
  public final void setViewStyle(c paramc)
  {
    oXa.b(paramc, "newStyle");
    this.A = paramc;
    a(paramc);
  }
  
  public static final class a {}
  
  public static abstract class b
  {
    public static final class a
      extends CollagePartView.b
    {
      private final Uri a;
      private final String b;
      
      public a(Uri paramUri, String paramString)
      {
        super();
        this.a = paramUri;
        this.b = paramString;
      }
      
      public final String a()
      {
        return this.b;
      }
      
      public final Uri b()
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
        Object localObject = this.a;
        int i = 0;
        int j;
        if (localObject != null) {
          j = ((Uri)localObject).hashCode();
        } else {
          j = 0;
        }
        localObject = this.b;
        if (localObject != null) {
          i = ((String)localObject).hashCode();
        }
        return j * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Content(imageUri=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", filterLabel=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends CollagePartView.b
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends CollagePartView.b
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
  
  public static abstract class c
  {
    private final int a;
    private final int b;
    private final int c;
    
    private c(int paramInt1, int paramInt2, int paramInt3)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramInt3;
    }
    
    public final int a()
    {
      return this.c;
    }
    
    public final int b()
    {
      return this.a;
    }
    
    public final int c()
    {
      return this.b;
    }
    
    public static final class a
      extends CollagePartView.c
    {
      public static final a d = new a();
      
      private a()
      {
        super(2131230969, 2131230874, null);
      }
    }
    
    public static final class b
      extends CollagePartView.c
    {
      public static final b d = new b();
      
      private b()
      {
        super(2131231049, 2131230875, null);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/CollagePartView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */