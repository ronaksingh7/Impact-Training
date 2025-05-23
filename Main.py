def is_scramble(s1, s2):
    if s1 == s2:
        return True
    if sorted(s1) != sorted(s2):
        return False
    for i in range(1, len(s1)):
        if (is_scramble(s1[:i], s2[:i]) and is_scramble(s1[i:], s2[i:])) or \
           (is_scramble(s1[:i], s2[-i:]) and is_scramble(s1[i:], s2[:-i])):
            return True
    return False

original = input().strip()
transmitted = input().strip()
print("true" if len(original) == len(transmitted) and is_scramble(original, transmitted) else "false")