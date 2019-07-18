import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

final class mbb
  extends Zab.a
{
  static final Zab.a a = new mbb();
  
  public Zab<DZa, ?> a(Type paramType, Annotation[] paramArrayOfAnnotation, vbb paramvbb)
  {
    if (Zab.a.a(paramType) != Optional.class) {
      return null;
    }
    return new mbb.a(paramvbb.b(Zab.a.a(0, (ParameterizedType)paramType), paramArrayOfAnnotation));
  }
  
  static final class a<T>
    implements Zab<DZa, Optional<T>>
  {
    final Zab<DZa, T> a;
    
    a(Zab<DZa, T> paramZab)
    {
      this.a = paramZab;
    }
    
    public Optional<T> a(DZa paramDZa)
      throws IOException
    {
      return Optional.ofNullable(this.a.a(paramDZa));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */