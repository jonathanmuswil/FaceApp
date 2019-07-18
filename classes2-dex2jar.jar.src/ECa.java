import android.graphics.Bitmap;
import android.graphics.PointF;

public final class eCa
  extends _Ba
{
  public eCa()
  {
    super("\n#ifdef GL_ES\nprecision mediump float;\n#endif\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D overlayTexture;\nuniform lowp float intensity;\n\nuniform float angle;\nuniform float scale;\nuniform vec2 ovrSize;\nuniform vec2 srcSize;\n\nconst vec3 ONE  = vec3(1.0);\nconst vec2 HALF = vec2(0.5);\n\nvec3 screen(vec3 a, vec3 b) {\n    return ONE - (ONE - a) * (ONE - b);\n}\n\nvoid main()\n{\n    float aSin = sin(angle);\n    float aCos = cos(angle);\n\n    float src_xtoy = srcSize.x / srcSize.y;\n    float ovr_xtoy = ovrSize.x / ovrSize.y;\n\n    vec2 overlayCoordinate = textureCoordinate;\n    overlayCoordinate -= HALF.xy;\n    overlayCoordinate *= vec2(src_xtoy, 1.0);\n    overlayCoordinate *= mat2(aCos, aSin, -aSin, aCos);\n    overlayCoordinate *= vec2(1.0 / src_xtoy, ovr_xtoy / src_xtoy);\n    overlayCoordinate *= vec2(1.0 / scale);\n    overlayCoordinate += HALF.xy;\n\n    vec3 tex = texture2D(inputImageTexture, textureCoordinate).rgb;\n    vec3 ovr = texture2D(overlayTexture, overlayCoordinate).rgb;\n    vec3 res = screen(tex, ovr);\n\n    gl_FragColor = vec4(mix(tex, res, intensity), 1.0);\n}\n", new String[] { "overlayTexture", "angle", "scale", "ovrSize", "srcSize" }, 0, 4, null);
  }
  
  public final void a(APa paramAPa)
  {
    oXa.b(paramAPa, "value");
    a("ovrSize", new PointF(paramAPa.c(), paramAPa.b()));
  }
  
  public final void a(Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "value");
    a("overlayTexture", paramBitmap);
  }
  
  public final void b(float paramFloat)
  {
    a("angle", Float.valueOf(paramFloat));
  }
  
  public final void b(APa paramAPa)
  {
    oXa.b(paramAPa, "value");
    a("srcSize", new PointF(paramAPa.c(), paramAPa.b()));
  }
  
  public final void c(float paramFloat)
  {
    a("scale", Float.valueOf(paramFloat));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */