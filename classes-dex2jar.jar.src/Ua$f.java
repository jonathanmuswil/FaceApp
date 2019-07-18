import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;

class Ua$f
{
  private static final Matrix a = new Matrix();
  private final Path b;
  private final Path c;
  private final Matrix d = new Matrix();
  Paint e;
  Paint f;
  private PathMeasure g;
  private int h;
  final Ua.c i;
  float j = 0.0F;
  float k = 0.0F;
  float l = 0.0F;
  float m = 0.0F;
  int n = 255;
  String o = null;
  Boolean p = null;
  final gd<String, Object> q = new gd();
  
  public Ua$f()
  {
    this.i = new Ua.c();
    this.b = new Path();
    this.c = new Path();
  }
  
  public Ua$f(f paramf)
  {
    this.i = new Ua.c(paramf.i, this.q);
    this.b = new Path(paramf.b);
    this.c = new Path(paramf.c);
    this.j = paramf.j;
    this.k = paramf.k;
    this.l = paramf.l;
    this.m = paramf.m;
    this.h = paramf.h;
    this.n = paramf.n;
    this.o = paramf.o;
    String str = paramf.o;
    if (str != null) {
      this.q.put(str, this);
    }
    this.p = paramf.p;
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return paramFloat1 * paramFloat4 - paramFloat2 * paramFloat3;
  }
  
  private float a(Matrix paramMatrix)
  {
    float[] arrayOfFloat = new float[4];
    float[] tmp5_4 = arrayOfFloat;
    tmp5_4[0] = 0.0F;
    float[] tmp9_5 = tmp5_4;
    tmp9_5[1] = 1.0F;
    float[] tmp13_9 = tmp9_5;
    tmp13_9[2] = 1.0F;
    float[] tmp17_13 = tmp13_9;
    tmp17_13[3] = 0.0F;
    tmp17_13;
    paramMatrix.mapVectors(arrayOfFloat);
    float f1 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
    float f2 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
    float f3 = a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
    f2 = Math.max(f1, f2);
    f1 = 0.0F;
    if (f2 > 0.0F) {
      f1 = Math.abs(f3) / f2;
    }
    return f1;
  }
  
  private void a(Ua.c paramc, Ua.e parame, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    float f1 = paramInt1 / this.l;
    float f2 = paramInt2 / this.m;
    float f3 = Math.min(f1, f2);
    paramc = paramc.a;
    this.d.set(paramc);
    this.d.postScale(f1, f2);
    f1 = a(paramc);
    if (f1 == 0.0F) {
      return;
    }
    parame.a(this.b);
    paramc = this.b;
    this.c.reset();
    if (parame.b())
    {
      this.c.addPath(paramc, this.d);
      paramCanvas.clipPath(this.c);
    }
    else
    {
      parame = (Ua.b)parame;
      if ((parame.k != 0.0F) || (parame.l != 1.0F))
      {
        float f4 = parame.k;
        float f5 = parame.m;
        float f6 = parame.l;
        if (this.g == null) {
          this.g = new PathMeasure();
        }
        this.g.setPath(this.b, false);
        f2 = this.g.getLength();
        f4 = (f4 + f5) % 1.0F * f2;
        f6 = (f6 + f5) % 1.0F * f2;
        paramc.reset();
        if (f4 > f6)
        {
          this.g.getSegment(f4, f2, paramc, true);
          this.g.getSegment(0.0F, f6, paramc, true);
        }
        else
        {
          this.g.getSegment(f4, f6, paramc, true);
        }
        paramc.rLineTo(0.0F, 0.0F);
      }
      this.c.addPath(paramc, this.d);
      Object localObject1;
      Object localObject2;
      if (parame.g.e())
      {
        paramc = parame.g;
        if (this.f == null)
        {
          this.f = new Paint(1);
          this.f.setStyle(Paint.Style.FILL);
        }
        localObject1 = this.f;
        if (paramc.c())
        {
          paramc = paramc.b();
          paramc.setLocalMatrix(this.d);
          ((Paint)localObject1).setShader(paramc);
          ((Paint)localObject1).setAlpha(Math.round(parame.j * 255.0F));
        }
        else
        {
          ((Paint)localObject1).setColor(Ua.a(paramc.a(), parame.j));
        }
        ((Paint)localObject1).setColorFilter(paramColorFilter);
        localObject2 = this.c;
        if (parame.i == 0) {
          paramc = Path.FillType.WINDING;
        } else {
          paramc = Path.FillType.EVEN_ODD;
        }
        ((Path)localObject2).setFillType(paramc);
        paramCanvas.drawPath(this.c, (Paint)localObject1);
      }
      if (parame.e.e())
      {
        localObject1 = parame.e;
        if (this.e == null)
        {
          this.e = new Paint(1);
          this.e.setStyle(Paint.Style.STROKE);
        }
        paramc = this.e;
        localObject2 = parame.o;
        if (localObject2 != null) {
          paramc.setStrokeJoin((Paint.Join)localObject2);
        }
        localObject2 = parame.n;
        if (localObject2 != null) {
          paramc.setStrokeCap((Paint.Cap)localObject2);
        }
        paramc.setStrokeMiter(parame.p);
        if (((kc)localObject1).c())
        {
          localObject1 = ((kc)localObject1).b();
          ((Shader)localObject1).setLocalMatrix(this.d);
          paramc.setShader((Shader)localObject1);
          paramc.setAlpha(Math.round(parame.h * 255.0F));
        }
        else
        {
          paramc.setColor(Ua.a(((kc)localObject1).a(), parame.h));
        }
        paramc.setColorFilter(paramColorFilter);
        paramc.setStrokeWidth(parame.f * (f3 * f1));
        paramCanvas.drawPath(this.c, paramc);
      }
    }
  }
  
  private void a(Ua.c paramc, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    paramc.a.set(paramMatrix);
    paramc.a.preConcat(paramc.j);
    paramCanvas.save();
    for (int i1 = 0; i1 < paramc.b.size(); i1++)
    {
      paramMatrix = (Ua.d)paramc.b.get(i1);
      if ((paramMatrix instanceof Ua.c)) {
        a((Ua.c)paramMatrix, paramc.a, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      } else if ((paramMatrix instanceof Ua.e)) {
        a(paramc, (Ua.e)paramMatrix, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      }
    }
    paramCanvas.restore();
  }
  
  public void a(Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    a(this.i, a, paramCanvas, paramInt1, paramInt2, paramColorFilter);
  }
  
  public boolean a()
  {
    if (this.p == null) {
      this.p = Boolean.valueOf(this.i.a());
    }
    return this.p.booleanValue();
  }
  
  public boolean a(int[] paramArrayOfInt)
  {
    return this.i.a(paramArrayOfInt);
  }
  
  public float getAlpha()
  {
    return getRootAlpha() / 255.0F;
  }
  
  public int getRootAlpha()
  {
    return this.n;
  }
  
  public void setAlpha(float paramFloat)
  {
    setRootAlpha((int)(paramFloat * 255.0F));
  }
  
  public void setRootAlpha(int paramInt)
  {
    this.n = paramInt;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ua$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */