import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

final class abb
  extends Sab.a
{
  static final Sab.a a = new abb();
  
  public Sab<?, ?> a(Type paramType, Annotation[] paramArrayOfAnnotation, vbb paramvbb)
  {
    if (Sab.a.a(paramType) != Rab.class) {
      return null;
    }
    return new _ab(this, xbb.b(paramType));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/abb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */