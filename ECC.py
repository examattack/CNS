from cryptography.hazmat.primitives.asymmetric import ec
from cryptography.hazmat.primitives import hashes

private = ec.generate_private_key(ec.SECP256R1())
public = private.public_key()

msg = b"HELLO"

signature = private.sign(
    msg, ec.ECDSA(hashes.SHA256())
)

try:
    public.verify(
        signature, msg, ec.ECDSA(hashes.SHA256())
    )
    print("Signature Verified")
except:
    print("Invalid Signature")
