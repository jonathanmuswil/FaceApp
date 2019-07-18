public final class uka$a
{
  public final uka a(qZ.b paramb)
  {
    oXa.b(paramb, "data");
    Object localObject = paramb.l();
    oXa.a(localObject, "data.left");
    float f = ((mZ)localObject).m();
    localObject = paramb.l();
    oXa.a(localObject, "data.left");
    localObject = new WVa(Float.valueOf(f), Float.valueOf(((mZ)localObject).l()));
    mZ localmZ = paramb.m();
    oXa.a(localmZ, "data.right");
    f = localmZ.m();
    paramb = paramb.m();
    oXa.a(paramb, "data.right");
    return new uka((WVa)localObject, new WVa(Float.valueOf(f), Float.valueOf(paramb.l())));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */