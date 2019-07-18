import java.io.IOException;
import java.util.Optional;

final class mbb$a<T>
  implements Zab<DZa, Optional<T>>
{
  final Zab<DZa, T> a;
  
  mbb$a(Zab<DZa, T> paramZab)
  {
    this.a = paramZab;
  }
  
  public Optional<T> a(DZa paramDZa)
    throws IOException
  {
    return Optional.ofNullable(this.a.a(paramDZa));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mbb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */