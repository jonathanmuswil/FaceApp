package io.faceapp.ui.components;

import GVa;
import KOa;
import QQa;
import QVa;
import RVa;
import UVa;
import WVa;
import XXa;
import _Va;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import eY;
import gRa;
import gWa;
import io.faceapp.l;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kRa;
import oXa;
import rXa;
import vXa;

public final class PreviewView
  extends View
  implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener
{
  private static final d a = d.a;
  private static final float b = KOa.b.a(1.0F);
  public static final a c = new a(null);
  private final Paint d = new Paint();
  private final Paint e = new Paint();
  private final Paint f = new Paint(1);
  private final RectF g = new RectF();
  private final Matrix h = new Matrix();
  private c i;
  private d j;
  private float k;
  private WVa<Bitmap, Bitmap> l;
  private boolean m = true;
  private Integer n;
  private kRa o;
  private final GVa<Object> p;
  
  public PreviewView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.p = localGVa;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, l.PreviewView, 0, 0);
    try
    {
      this.m = paramContext.getBoolean(1, true);
      this.i = a(paramContext.getInt(0, 0));
      this.j = d.d.a(paramContext.getInt(2, a.getId()));
      paramContext.recycle();
      this.e.setDither(true);
      this.f.setColor((int)4292730333L);
      this.f.setStrokeWidth(b);
      this.f.setStyle(Paint.Style.STROKE);
      return;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  private final c a(int paramInt)
  {
    Object localObject;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt == 2) {
          localObject = new b();
        } else {
          throw new IllegalArgumentException("unknown animation type");
        }
      }
      else {
        localObject = new f();
      }
    }
    else {
      localObject = new e();
    }
    return (c)localObject;
  }
  
  private final void a(Canvas paramCanvas, int paramInt)
  {
    WVa localWVa;
    if (paramInt != 0)
    {
      localWVa = this.l;
      if (localWVa != null) {
        paramCanvas.drawBitmap((Bitmap)localWVa.d(), null, this.g, this.d);
      }
    }
    else
    {
      localWVa = this.l;
      if (localWVa != null) {
        paramCanvas.drawBitmap((Bitmap)localWVa.c(), null, this.g, this.d);
      }
    }
  }
  
  private final void c()
  {
    if ((getWidth() > 0) && (getHeight() > 0))
    {
      Object localObject = this.l;
      if (localObject != null)
      {
        localObject = (Bitmap)((WVa)localObject).a();
        float f1 = getWidth() / ((Bitmap)localObject).getWidth();
        float f2 = getHeight() / ((Bitmap)localObject).getHeight();
        d locald = this.j;
        int i1 = t.a[locald.ordinal()];
        if (i1 != 1)
        {
          if (i1 == 2) {
            f1 = Math.max(f1, f2);
          } else {
            throw new UVa();
          }
        }
        else {
          f1 = Math.min(f1, f2);
        }
        float f3 = ((Bitmap)localObject).getWidth() * f1;
        f2 = ((Bitmap)localObject).getHeight() * f1;
        float f4 = getWidth();
        float f5 = 2;
        f4 = (f4 - f3) / f5;
        f5 = (getHeight() - f2) / f5;
        this.g.set(f4, f5, f3 + f4, f2 + f5);
        this.h.reset();
        this.h.postScale(f1, f1);
        this.h.postTranslate(f4, f5);
        invalidate();
      }
    }
  }
  
  private final void d()
  {
    boolean bool = this.i.c();
    Integer localInteger = Integer.valueOf(2);
    Object localObject = Integer.valueOf(0);
    if (bool) {
      localObject = QQa.a(QQa.d(localInteger).b(1L, TimeUnit.SECONDS), QQa.d(localObject).b(2L, TimeUnit.SECONDS)).l().e(localObject);
    } else {
      localObject = QQa.a(QQa.d(localObject), QQa.d(localInteger).b(1L, TimeUnit.SECONDS), QQa.f().b(2L, TimeUnit.SECONDS));
    }
    localObject = ((QQa)localObject).a(gRa.a());
    oXa.a(localObject, "obs\n                .obs…dSchedulers.mainThread())");
    this.o = eY.a((QQa)localObject, this).a(new u(this), v.a, new w(this));
  }
  
  public final void a()
  {
    kRa localkRa = this.o;
    if (localkRa != null) {
      localkRa.i();
    }
    if (this.i.a().isRunning()) {
      this.i.a().end();
    }
  }
  
  public final void a(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    oXa.b(paramBitmap1, "bitmap1");
    oXa.b(paramBitmap2, "bitmap2");
    this.l = new WVa(paramBitmap1, paramBitmap2);
    c();
  }
  
  public final void b()
  {
    this.n = null;
    Object localObject = this.o;
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    KOa localKOa = KOa.b;
    localObject = getContext();
    oXa.a(localObject, "context");
    if (localKOa.g((Context)localObject)) {
      d();
    } else {
      this.i.a().start();
    }
  }
  
  public final GVa<Object> getAnimationEnded()
  {
    return this.p;
  }
  
  public void onAnimationCancel(Animator paramAnimator) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.p.a(Boolean.valueOf(true));
  }
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    this.p.a(Boolean.valueOf(true));
  }
  
  public void onAnimationStart(Animator paramAnimator) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    oXa.b(paramValueAnimator, "animation");
    paramValueAnimator = paramValueAnimator.getAnimatedValue();
    if (paramValueAnimator != null)
    {
      this.k = ((Float)paramValueAnimator).floatValue();
      invalidate();
      return;
    }
    throw new _Va("null cannot be cast to non-null type kotlin.Float");
  }
  
  protected void onDetachedFromWindow()
  {
    a();
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    oXa.b(paramCanvas, "canvas");
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(-1);
    Object localObject = this.n;
    if (localObject != null)
    {
      a(paramCanvas, ((Integer)localObject).intValue());
    }
    else
    {
      localObject = this.l;
      if (localObject != null) {
        this.i.a(paramCanvas, (Bitmap)((WVa)localObject).c(), (Bitmap)((WVa)localObject).d(), this.k);
      }
    }
    if (this.m)
    {
      localObject = this.g;
      float f1 = ((RectF)localObject).left;
      float f2 = b;
      float f3 = 2;
      paramCanvas.drawRect(f1 + f2 / f3, ((RectF)localObject).top + f2 / f3, ((RectF)localObject).right - f2 / f3, ((RectF)localObject).bottom - f2 / f3, this.f);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    c();
  }
  
  public static final class a {}
  
  public final class b
    extends PreviewView.c
  {
    private final boolean d;
    private final float[] e = { 1.0F, 0.2F };
    
    public b()
    {
      super();
    }
    
    public void a(Canvas paramCanvas, Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt, float paramFloat)
    {
      oXa.b(paramCanvas, "canvas");
      oXa.b(paramBitmap1, "bitmap1");
      oXa.b(paramBitmap2, "bitmap2");
      if (paramInt != 0)
      {
        if (paramInt == 1)
        {
          paramCanvas.drawBitmap(paramBitmap1, null, PreviewView.b(this.f), PreviewView.d(this.f));
          PreviewView.a(this.f).setShader(null);
          PreviewView.a(this.f).setAlpha((int)('ÿ' * paramFloat));
          paramCanvas.drawBitmap(paramBitmap2, null, PreviewView.b(this.f), PreviewView.a(this.f));
        }
      }
      else {
        paramCanvas.drawBitmap(paramBitmap1, null, PreviewView.b(this.f), PreviewView.d(this.f));
      }
    }
    
    public float[] b()
    {
      return this.e;
    }
    
    public boolean c()
    {
      return this.d;
    }
  }
  
  public abstract class c
  {
    private final QVa b = RVa.a(new s(this));
    
    static
    {
      rXa localrXa = new rXa(vXa.a(c.class), "animator", "getAnimator()Landroid/animation/ValueAnimator;");
      vXa.a(localrXa);
      a = new XXa[] { localrXa };
    }
    
    private final ValueAnimator d()
    {
      ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, gWa.a(b()) });
      localValueAnimator.setDuration(('Ϩ' * gWa.a(b())));
      localValueAnimator.setInterpolator(new LinearInterpolator());
      localValueAnimator.addListener(this.c);
      localValueAnimator.addUpdateListener(this.c);
      if (c())
      {
        localValueAnimator.setRepeatMode(1);
        localValueAnimator.setRepeatCount(-1);
      }
      oXa.a(localValueAnimator, "ValueAnimator.ofFloat(0f…E\n            }\n        }");
      return localValueAnimator;
    }
    
    public final ValueAnimator a()
    {
      QVa localQVa = this.b;
      XXa localXXa = a[0];
      return (ValueAnimator)localQVa.getValue();
    }
    
    public final void a(Canvas paramCanvas, Bitmap paramBitmap1, Bitmap paramBitmap2, float paramFloat)
    {
      oXa.b(paramCanvas, "canvas");
      oXa.b(paramBitmap1, "bitmap1");
      oXa.b(paramBitmap2, "bitmap2");
      float[] arrayOfFloat = b();
      int i = arrayOfFloat.length;
      int j = 0;
      float f1 = 0.0F;
      int k = 0;
      while (j < i)
      {
        float f2 = arrayOfFloat[j];
        float f3 = f1 + f2;
        if (paramFloat < f3)
        {
          if (k != 0) {
            paramFloat -= f1;
          }
          a(paramCanvas, paramBitmap1, paramBitmap2, k, paramFloat / f2);
          return;
        }
        j++;
        k++;
        f1 = f3;
      }
      a(paramCanvas, paramBitmap1, paramBitmap2, b().length - 1, 1.0F);
    }
    
    public abstract void a(Canvas paramCanvas, Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt, float paramFloat);
    
    public abstract float[] b();
    
    public abstract boolean c();
  }
  
  public static enum d
  {
    public static final a d = new a(null);
    private final int e;
    
    static
    {
      d locald1 = new d("FIT_CENTER", 0, 0);
      a = locald1;
      d locald2 = new d("CENTER_CROP", 1, 1);
      b = locald2;
      c = new d[] { locald1, locald2 };
    }
    
    private d(int paramInt)
    {
      this.e = paramInt;
    }
    
    public final int getId()
    {
      return this.e;
    }
    
    public static final class a
    {
      public final PreviewView.d a(int paramInt)
      {
        for (PreviewView.d locald : )
        {
          int k;
          if (locald.getId() == paramInt) {
            k = 1;
          } else {
            k = 0;
          }
          if (k != 0) {
            return locald;
          }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
      }
    }
  }
  
  public class e
    extends PreviewView.c
  {
    private final float d = 0.005F;
    private final double e = 0.3249D;
    private final boolean f;
    private final float[] g = { 0.333F, 1.5F, 0.8F };
    
    public e()
    {
      super();
    }
    
    private final Shader a(float paramFloat1, float paramFloat2, Bitmap paramBitmap, float paramFloat3)
    {
      double d1 = this.e;
      double d2 = this.d * paramFloat1;
      float f1 = (float)(Math.cos(d1) * d2);
      float f2 = (float)(d2 * Math.sin(d1));
      float f3 = (float)(paramFloat2 * Math.tan(d1));
      float f4 = 2;
      float f5 = f3 / f4;
      float f6 = -f1;
      paramFloat1 = (f3 + paramFloat1 + f1 + f4 * f5) * paramFloat3;
      LinearGradient localLinearGradient = new LinearGradient(f6 - f5 + paramFloat1, paramFloat2, -f5 + paramFloat1, paramFloat2 - f2, -1, 0, Shader.TileMode.CLAMP);
      localLinearGradient.setLocalMatrix(PreviewView.c(this.h));
      Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
      paramBitmap = new BitmapShader(paramBitmap, localTileMode, localTileMode);
      paramBitmap.setLocalMatrix(PreviewView.c(this.h));
      return new ComposeShader(localLinearGradient, paramBitmap, PorterDuff.Mode.SRC_IN);
    }
    
    public void a(Canvas paramCanvas, Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt, float paramFloat)
    {
      oXa.b(paramCanvas, "canvas");
      oXa.b(paramBitmap1, "bitmap1");
      oXa.b(paramBitmap2, "bitmap2");
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt == 2) {
            paramCanvas.drawBitmap(paramBitmap2, null, PreviewView.b(this.h), PreviewView.d(this.h));
          }
        }
        else
        {
          paramCanvas.drawBitmap(paramBitmap1, null, PreviewView.b(this.h), PreviewView.d(this.h));
          PreviewView.a(this.h).setAlpha(255);
          PreviewView.a(this.h).setShader(a(PreviewView.b(this.h).width(), PreviewView.b(this.h).height(), paramBitmap2, paramFloat));
          paramCanvas.drawRect(PreviewView.b(this.h), PreviewView.a(this.h));
        }
      }
      else {
        paramCanvas.drawBitmap(paramBitmap1, null, PreviewView.b(this.h), PreviewView.d(this.h));
      }
    }
    
    public float[] b()
    {
      return this.g;
    }
    
    public boolean c()
    {
      return this.f;
    }
  }
  
  public final class f
    extends PreviewView.e
  {
    private final float[] i = { 0.2F, 1.5F, 1.0F, 0.4F };
    private final boolean j = true;
    
    public f()
    {
      super();
    }
    
    public void a(Canvas paramCanvas, Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt, float paramFloat)
    {
      oXa.b(paramCanvas, "canvas");
      oXa.b(paramBitmap1, "bitmap1");
      oXa.b(paramBitmap2, "bitmap2");
      if (paramInt == 3)
      {
        paramCanvas.drawBitmap(paramBitmap1, null, PreviewView.b(this.k), PreviewView.d(this.k));
        PreviewView.a(this.k).setShader(null);
        PreviewView.a(this.k).setAlpha((int)('ÿ' * (1 - paramFloat)));
        paramCanvas.drawBitmap(paramBitmap2, null, PreviewView.b(this.k), PreviewView.a(this.k));
      }
      else
      {
        super.a(paramCanvas, paramBitmap1, paramBitmap2, paramInt, paramFloat);
      }
    }
    
    public float[] b()
    {
      return this.i;
    }
    
    public boolean c()
    {
      return this.j;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/PreviewView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */