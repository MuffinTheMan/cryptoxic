# Cryptographic Exercises

Simple implementations of select methods of cryptographic schemes to facilitate understanding various principles of cryptography.

Forgive my code oddities. Java is not in my top 5 go-to languages, and I'm using it here to get more exposure to and practice with the language.

## Application

Run with `./gradlew run -PappArgs="['input.txt']"` (where "input.txt" is your input file)

## Symmetric Key Encryption

The same key used to encrypt a message is also used to decrypt the message.

### [Caesar Cipher](https://en.wikipedia.org/wiki/Caesar_cipher)

Shifts each character in the plain text by 'e' characters to the right to give a resulting cipher text. Utterly unsecure. Easily suseptible to both brute force methods (key space is limited to the number of characters available) and character frequency analysis.

### Block Cipher (Shift)

Splits a plain text message into blocks of size 't' (t characters per block based on the length of the user-supplied key--namely, t = key.length), and shifts each character within each block according to the permutation (key) given by the user. For example, if the key were '154' the block size would be 3; and the first character in each block would shift 1 character to the right, the second would shift 5 to the right and the third would shift 4 to the right. This permutation would repeat for each block until all blocks have been shifted (encrypted).