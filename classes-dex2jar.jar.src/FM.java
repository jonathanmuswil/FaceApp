import java.io.File;

class fm
  extends dba
  implements Ql
{
  public fm(Uaa paramUaa, String paramString1, String paramString2, yca paramyca)
  {
    super(paramUaa, paramString1, paramString2, paramyca, uca.b);
  }
  
  private wca a(wca paramwca, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Crashlytics Android SDK/");
    localStringBuilder.append(this.f.j());
    paramwca.c("User-Agent", localStringBuilder.toString());
    paramwca.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
    paramwca.c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f.j());
    paramwca.c("X-CRASHLYTICS-API-KEY", paramString);
    return paramwca;
  }
  
  private wca a(wca paramwca, pm parampm)
  {
    paramwca.e("report_id", parampm.b());
    for (File localFile : parampm.d()) {
      if (localFile.getName().equals("minidump")) {
        paramwca.a("minidump_file", localFile.getName(), "application/octet-stream", localFile);
      } else if (localFile.getName().equals("metadata")) {
        paramwca.a("crash_meta_file", localFile.getName(), "application/octet-stream", localFile);
      } else if (localFile.getName().equals("binaryImages")) {
        paramwca.a("binary_images_file", localFile.getName(), "application/octet-stream", localFile);
      } else if (localFile.getName().equals("session")) {
        paramwca.a("session_meta_file", localFile.getName(), "application/octet-stream", localFile);
      } else if (localFile.getName().equals("app")) {
        paramwca.a("app_meta_file", localFile.getName(), "application/octet-stream", localFile);
      } else if (localFile.getName().equals("device")) {
        paramwca.a("device_meta_file", localFile.getName(), "application/octet-stream", localFile);
      } else if (localFile.getName().equals("os")) {
        paramwca.a("os_meta_file", localFile.getName(), "application/octet-stream", localFile);
      } else if (localFile.getName().equals("user")) {
        paramwca.a("user_meta_file", localFile.getName(), "application/octet-stream", localFile);
      } else if (localFile.getName().equals("logs")) {
        paramwca.a("logs_file", localFile.getName(), "application/octet-stream", localFile);
      } else if (localFile.getName().equals("keys")) {
        paramwca.a("keys_file", localFile.getName(), "application/octet-stream", localFile);
      }
    }
    return paramwca;
  }
  
  public boolean a(Pl paramPl)
  {
    Object localObject = a();
    a((wca)localObject, paramPl.a);
    a((wca)localObject, paramPl.b);
    Xaa localXaa = Naa.e();
    paramPl = new StringBuilder();
    paramPl.append("Sending report to: ");
    paramPl.append(b());
    localXaa.d("CrashlyticsCore", paramPl.toString());
    int i = ((wca)localObject).g();
    localObject = Naa.e();
    paramPl = new StringBuilder();
    paramPl.append("Result was: ");
    paramPl.append(i);
    ((Xaa)localObject).d("CrashlyticsCore", paramPl.toString());
    boolean bool;
    if (Gba.a(i) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */