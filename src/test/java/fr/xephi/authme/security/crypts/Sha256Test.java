package fr.xephi.authme.security.crypts;

/**
 * Test for {@link Sha256}.
 */
public class Sha256Test extends AbstractEncryptionMethodTest {

    public Sha256Test() {
        super(new Sha256(),
            "$SHA$11aa0706173d7272$dbba96681c2ae4e0bfdf226d70fbbc5e4ee3d8071faa613bc533fe8a64817d10", // password
            "$SHA$1f0e561445837ed4$UGFzc1dvcmQxXzFmMGU1NjE0NDU4MzdlZDQ=", // PassWord1
            "$SHA$10c4a377121eab80$Jl4ldGUkdD9Qd0BfXzEwYzRhMzc3MTIxZWFiODA=", // &^%te$t?Pw@_
            "$SHA$0b503d90dd9949d4$ba70c330242e0daa9a154ec9f4cce7f01dd05aff489d37c653e36a507c74d84f"  // âË_3(íù*
        );
    }

}
