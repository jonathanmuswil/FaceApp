final class cga<T>
  implements ARa<uia>
{
  cga(Zfa paramZfa, uXa paramuXa1, uXa paramuXa2) {}
  
  public final void a(uia paramuia)
  {
    if (paramuia.d())
    {
      Zfa localZfa = this.a;
      paramuia = paramuia.a();
      Float localFloat = (Float)this.b.a;
      if (localFloat != null)
      {
        float f = localFloat.floatValue();
        localFloat = (Float)this.c.a;
        if (localFloat != null) {
          localZfa.b(new Zfa.a(paramuia, f, localFloat.floatValue()));
        } else {
          throw new IllegalArgumentException("Required value was null.");
        }
      }
      else
      {
        throw new IllegalArgumentException("Required value was null.");
      }
    }
    else
    {
      this.a.a(new tia(paramuia.b(), paramuia.c()));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */