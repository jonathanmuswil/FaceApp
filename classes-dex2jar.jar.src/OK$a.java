import com.google.android.gms.common.api.Status;

final class OK$a
  implements CO.b
{
  private final Status a;
  private final EO b;
  
  public OK$a(Status paramStatus, EO paramEO)
  {
    this.a = paramStatus;
    this.b = paramEO;
  }
  
  public final Status w()
  {
    return this.a;
  }
  
  public final String x()
  {
    EO localEO = this.b;
    if (localEO == null) {
      return null;
    }
    return localEO.x();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/OK$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */