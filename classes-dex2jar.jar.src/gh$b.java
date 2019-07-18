class gh$b<Model, Data>
{
  private final Class<Model> a;
  final Class<Data> b;
  final dh<? extends Model, ? extends Data> c;
  
  public gh$b(Class<Model> paramClass, Class<Data> paramClass1, dh<? extends Model, ? extends Data> paramdh)
  {
    this.a = paramClass;
    this.b = paramClass1;
    this.c = paramdh;
  }
  
  public boolean a(Class<?> paramClass)
  {
    return this.a.isAssignableFrom(paramClass);
  }
  
  public boolean a(Class<?> paramClass1, Class<?> paramClass2)
  {
    boolean bool;
    if ((a(paramClass1)) && (this.b.isAssignableFrom(paramClass2))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gh$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */