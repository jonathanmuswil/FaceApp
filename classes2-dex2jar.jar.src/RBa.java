public final class rBa
  implements aBa<PAYLOAD>
{
  public PAYLOAD a(String paramString)
  {
    oXa.b(paramString, "key");
    Object localObject1 = this.a.b();
    Object localObject2 = null;
    Object localObject3 = localObject2;
    if (localObject1 != null)
    {
      localObject3 = localObject2;
      if (oXa.a(this.a.a(), paramString)) {
        localObject3 = localObject1;
      }
    }
    return (PAYLOAD)localObject3;
  }
  
  public void a(String paramString, bXa<? extends PAYLOAD> parambXa)
  {
    oXa.b(paramString, "key");
    oXa.b(parambXa, "pay");
    this.a.a(parambXa.b());
    this.a.a(paramString);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */