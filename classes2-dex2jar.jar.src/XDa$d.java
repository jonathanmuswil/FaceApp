public abstract class XDa$d
{
  public static final class a
    extends XDa.d
  {
    private final XDa.b a;
    private final _Da<?> b;
    
    public a(XDa.b paramb, _Da<?> param_Da)
    {
      super();
      this.a = paramb;
      this.b = param_Da;
    }
    
    public final XDa.b a()
    {
      return this.a;
    }
    
    public final _Da<?> b()
    {
      return this.b;
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
        j = ((Enum)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = localObject.hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Content(mode=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", savedPresenter=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/XDa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */