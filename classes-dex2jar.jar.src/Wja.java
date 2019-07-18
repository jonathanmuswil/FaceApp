final class wja<T, R>
  implements DRa<T, R>
{
  wja(Aja paramAja) {}
  
  public final void a(Boolean paramBoolean)
  {
    oXa.b(paramBoolean, "shouldRun");
    if ((paramBoolean.booleanValue()) && (this.a.p() != null))
    {
      icb.a("Camera").a("cameraInit", new Object[0]);
      Aja.a(this.a);
    }
    else
    {
      icb.a("Camera").a("cameraStop", new Object[0]);
      Aja.b(this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */