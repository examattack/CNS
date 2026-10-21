from cryptography.fernet import Fernet

key = Fernet.generate_key()
cipher = Fernet(key)

msg = input("Enter message: ").encode()

encrypted = cipher.encrypt(msg)
print("Encrypted:", encrypted)

decrypted = cipher.decrypt(encrypted)
print("Decrypted:", decrypted.decode())
