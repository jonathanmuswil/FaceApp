public final class lya$c
{
  public final lya a(rka paramrka)
  {
    oXa.b(paramrka, "tool");
    String str = paramrka.c();
    switch (str.hashCode())
    {
    default: 
      break;
    case 1615078484: 
      if (str.equals("effect-tool")) {
        paramrka = new lya.e(paramrka);
      }
      break;
    case 1266959063: 
      if (str.equals("background-tool")) {
        paramrka = new lya.b(paramrka);
      }
      break;
    case 1247799989: 
      if (str.equals("crop-tool")) {
        paramrka = new lya.d(paramrka);
      }
      break;
    case 809064011: 
      if (str.equals("vignette-tool")) {
        paramrka = new lya.g(paramrka, pya.o.i);
      }
      break;
    case 239761653: 
      if (str.equals("overlay-tool")) {
        paramrka = new lya.f(paramrka);
      }
      break;
    case -127031528: 
      if (str.equals("tattoo-tool")) {
        paramrka = new lya.h(paramrka);
      }
      break;
    case -362331553: 
      if (str.equals("adjustments-tool")) {
        paramrka = new lya.a(paramrka);
      }
      break;
    case -1019709123: 
      if (str.equals("lens_blur-tool")) {
        paramrka = new lya.g(paramrka, pya.h.i);
      }
      break;
    }
    paramrka = null;
    return paramrka;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lya$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */