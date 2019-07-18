public final class wka$a
{
  public final wka a(XY paramXY)
  {
    oXa.b(paramXY, "proto");
    String str1 = paramXY.m();
    oXa.a(str1, "proto.faceId");
    String str2 = paramXY.l();
    oXa.a(str2, "proto.depthMap");
    String str3 = paramXY.p();
    oXa.a(str3, "proto.triMap");
    String str4 = paramXY.n();
    oXa.a(str4, "proto.facePoints");
    paramXY = paramXY.o();
    oXa.a(paramXY, "proto.hairMask");
    return new wka(str1, str2, str3, str4, paramXY);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */