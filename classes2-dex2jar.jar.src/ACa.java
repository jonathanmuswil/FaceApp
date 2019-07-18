public final class aCa
  extends _Ba
{
  public aCa()
  {
    super("\n#ifdef GL_ES\nprecision mediump float;\n#endif\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform lowp float intensity;\n\nconst vec3 W = vec3(0.2125, 0.7154, 0.0721);\nconst vec3 ONE = vec3(1.0);\nconst vec3 YEL = vec3(0.73, 0.65, 0.41);\nconst vec3 CYA = vec3(0.08, 0.66, 0.75);\n\nfloat cubicPulse( float c, float w, float x )\n{\n    x = abs(x - c);\n    if ( x > w ) return 0.0;\n    x /= w;\n    return 1.0 - x*x*(3.0-2.0*x);\n}\n\nvec3 screen(vec3 a, vec3 b) {\n    return ONE - (ONE - a) * (ONE - b);\n}\n\nvoid main()\n{\n    vec3  tex  = texture2D(inputImageTexture, textureCoordinate).rgb;\n\n    float lum   = cubicPulse(1.0, 0.8, 1.0 - textureCoordinate.t);\n    float lum2  = cubicPulse(0.0, 0.8, 1.0 - textureCoordinate.t);\n    vec3 stripe = lum * YEL + lum2 * CYA;\n\n    vec3 resultColor = screen(mix(vec3(0.5), tex, 1.5), stripe);\n    gl_FragColor = vec4((intensity * resultColor) + ((1.0 - intensity) * tex), 1.0);\n}\n", new String[0], 0, 4, null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/aCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */