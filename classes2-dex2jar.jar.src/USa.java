import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;
import java.util.Set;

public final class usa
{
  private static final Set<WVa<String, String>> a = IWa.a(new WVa[] { new WVa("samsung", "sm-g950x"), new WVa("samsung", "sm-g955x"), new WVa("samsung", "sm-g960x"), new WVa("samsung", "sm-g965x"), new WVa("samsung", "sm-g970x"), new WVa("samsung", "sm-g973x"), new WVa("samsung", "sm-g975x"), new WVa("samsung", "sm-g977x"), new WVa("samsung", "sm-n950x"), new WVa("samsung", "sm-n960x") });
  public static final usa b = new usa();
  
  private final boolean a(dfa paramdfa)
  {
    String str1 = paramdfa.getDeviceBrand();
    if (str1 != null) {
      if (str1 != null)
      {
        String str2 = str1.toLowerCase();
        oXa.a(str2, "(this as java.lang.String).toLowerCase()");
        if (str2 != null)
        {
          paramdfa = paramdfa.getDeviceModel();
          if (paramdfa != null) {
            if (paramdfa != null)
            {
              str1 = paramdfa.toLowerCase();
              oXa.a(str1, "(this as java.lang.String).toLowerCase()");
              if (str1 != null)
              {
                paramdfa = Uma.qa.j().get();
                oXa.a(paramdfa, "AppPreferences.debugPhotosByGoodCamera.get()");
                if (((Boolean)paramdfa).booleanValue()) {
                  return true;
                }
                paramdfa = str1;
                if (oXa.a(str2, "samsung"))
                {
                  paramdfa = str1;
                  if (str1.length() >= 8)
                  {
                    paramdfa = new StringBuilder();
                    if (str1 != null)
                    {
                      str1 = str1.substring(0, 7);
                      oXa.a(str1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                      paramdfa.append(str1);
                      paramdfa.append('x');
                      paramdfa = paramdfa.toString();
                    }
                    else
                    {
                      throw new _Va("null cannot be cast to non-null type java.lang.String");
                    }
                  }
                }
                return a.contains(new WVa(str2, paramdfa));
              }
            }
            else
            {
              throw new _Va("null cannot be cast to non-null type java.lang.String");
            }
          }
          return false;
        }
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type java.lang.String");
      }
    }
    return false;
  }
  
  public final boolean a(Vja paramVja, dfa paramdfa)
  {
    oXa.b(paramVja, "imageDesc");
    oXa.b(paramdfa, "photoInfo");
    if (FaceApplication.d.b().b(paramVja.c()))
    {
      icb.a("ApiHelper").a("UploadOriginalSizePhoto blocked: image is FaceApp-Generated", new Object[0]);
      return false;
    }
    if (!a(paramdfa))
    {
      icb.a("ApiHelper").a("UploadOriginalSizePhoto blocked: bad photo camera", new Object[0]);
      return false;
    }
    if (!((Boolean)ePa.a.a().c()).booleanValue())
    {
      icb.a("ApiHelper").a("UploadOriginalSizePhoto blocked: not-WiFi connection", new Object[0]);
      return false;
    }
    icb.a("ApiHelper").a("UploadOriginalSizePhoto ALLOWED", new Object[0]);
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/usa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */