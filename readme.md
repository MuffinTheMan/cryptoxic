### Branch Management Note:

Though at this point in time the term "stable" is virtually meaningless (after all, this project is to be a compilation of exercises), **master** would be the "stable" branch (again, not helpful terminoligy in the current context of this repo, since I simply decide to merge into master every so often when I feel like I've reached an okay spot in the project). The **develop** branch is the main branch I'm working on at any given time, so check that one out to see where I'm currently at in this project.

# Cryptographic Exercises

At this time, this project is for simple implementations of select methods of cryptographic schemes to facilitate understanding various principles of cryptography.

Forgive my code oddities. Java is not a language I've used much since a handful of college assignments, and I'm using it here to get more exposure to and practice with the language. Let me know if you find specific ways I'm using Java in a non-Java way that I should be aware of to correct.

## Application

Run with `./gradlew run -PappArgs="['input.txt']"` (where "input.txt" is your input file)

## Symmetric Key Encryption

The same key used to encrypt a message is also used to decrypt the message.

### [Caesar Cipher](https://en.wikipedia.org/wiki/Caesar_cipher)

Shifts each character in the plain text by 'e' characters to the right to give a resulting cipher text. Utterly unsecure. Easily suseptible to both brute force methods (key space is limited to the number of characters available) and character frequency analysis.

I have dumbed down the implementation to only accept and shift letters from the alphabet `[a-zA-Z]` and to leave spaces alone. It's already not a practical cipher, so why bother making the implementation super practical?

### [Affine Cipher](https://en.wikipedia.org/wiki/Affine_cipher)

Similar to the Caesar Cipher, but with a twist. Shifts each character in the plain text by a factor computed by `(ax + b) % m` (where `x` is the numerical value of the plain text character, `m` is the size of the alphabet--26 if using simple English alphabet-- and `a` is [coprime](https://en.wikipedia.org/wiki/Coprime_integers) with `m`). Utterly unsecure. Easily suseptible to both brute force methods (though less so than the Caesar Cipher, since the key space is a bit larger) and character frequency analysis.

### Block Cipher (Shift)

Splits a plain text message into blocks of size 't' (t characters per block based on the length of the user-supplied key--namely, t = key.length), and shifts each character within each block according to the permutation (key) given by the user. For example, if the key were '154' the block size would be 3; and the first character in each block would shift 1 character to the right, the second would shift 5 to the right and the third would shift 4 to the right. This permutation would repeat for each block until all blocks have been shifted (encrypted).