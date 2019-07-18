import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

class wb<T>
  extends Property<T, Float>
{
  private final Property<T, PointF> a;
  private final PathMeasure b;
  private final float c;
  private final float[] d = new float[2];
  private final PointF e = new PointF();
  private float f;
  
  wb(Property<T, PointF> paramProperty, Path paramPath)
  {
    super(Float.class, paramProperty.getName());
    this.a = paramProperty;
    this.b = new PathMeasure(paramPath, false);
    this.c = this.b.getLength();
  }
  
  public void a(T paramT, Float paramFloat)
  {
    this.f = paramFloat.floatValue();
    this.b.getPosTan(this.c * paramFloat.floatValue(), this.d, null);
    PointF localPointF = this.e;
    paramFloat = this.d;
    localPointF.x = paramFloat[0];
    localPointF.y = paramFloat[1];
    this.a.set(paramT, localPointF);
  }
  
  public Float get(T paramT)
  {
    return Float.valueOf(this.f);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */