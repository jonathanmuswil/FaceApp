class Jf$c
  implements Af.d
{
  private final pg.a a;
  private volatile pg b;
  
  Jf$c(pg.a parama)
  {
    this.a = parama;
  }
  
  public pg a()
  {
    if (this.b == null) {
      try
      {
        if (this.b == null) {
          this.b = this.a.build();
        }
        if (this.b == null)
        {
          qg localqg = new qg;
          localqg.<init>();
          this.b = localqg;
        }
      }
      finally {}
    }
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Jf$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */