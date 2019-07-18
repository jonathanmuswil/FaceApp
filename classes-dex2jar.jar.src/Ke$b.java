class Ke$b
  implements yi.a
{
  private final Li a;
  
  Ke$b(Ke paramKe, Li paramLi)
  {
    this.a = paramLi;
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      synchronized (this.b)
      {
        this.a.c();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ke$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */