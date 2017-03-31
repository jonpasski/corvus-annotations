# How to Contribute to Corvus

## Reporting Issues

Please report [issues](https://github.com/CoastalHacking/corvus-annotations/issues) in Corvus
with some type of reproducer or test case (manual or automated).

## Compiling

With Java 8 and Maven 3 installed:

`mvn clean verify` - compile and test

## Workflow

Corvus uses a [triangular workflow](https://www.sociomantic.com/blog/2014/05/git-triangular-workflow/).
Contributions aren't pushed directly into the main repository. Rather, a
contributor forks [the main repository](https://github.com/CoastalHacking/corvus-annotations/)
and pushes their changes to this fork. Then, they generate a pull request based
on the fork. Later, a maintainer reviews the pull request and makes a
determination on merging it into the main repository.

### Set up the triangular workflow

Fork the main repository. Then clone the main repository (not your fork)
locally:

    git clone https://github.com/CoastalHacking/corvus-annotations.git

Add your fork repository as a remote:

    cd corvus-annotations
    git remote add fork git@github.com:your-github-user/corvus-annotations.git

Note: use the SSH, not HTTPS, URL for your fork repository. You should have two
remotes:

    git remote
    fork
    origin

Configure pushes to the fork remote versus the origin:

    git config remote.pushdefault fork

You've setup two out of the three sides of a triangular workflow, with the
third being your pull requests.

## Contribution guidelines

### Sign your work

Corvus uses the [developercertificate.org](http://developercertificate.org/)
convention of signing work at the end of a commit:

    Signed-off-by: Pat Doe <pat.doe@email.com>

Using your actual name, not your twitter handle or other personas :)

When you sign a commit this way, you are certifying the below:

```
Developer Certificate of Origin
Version 1.1

Copyright (C) 2004, 2006 The Linux Foundation and its contributors.
660 York Street, Suite 102,
San Francisco, CA 94110 USA

Everyone is permitted to copy and distribute verbatim copies of this
license document, but changing it is not allowed.


Developer's Certificate of Origin 1.1

By making a contribution to this project, I certify that:

(a) The contribution was created in whole or in part by me and I
    have the right to submit it under the open source license
    indicated in the file; or

(b) The contribution is based upon previous work that, to the best
    of my knowledge, is covered under an appropriate open source
    license and I have the right under that license to submit that
    work with modifications, whether created in whole or in part
    by me, under the same open source license (unless I am
    permitted to submit under a different license), as indicated
    in the file; or

(c) The contribution was provided directly to me by some other
    person who certified (a), (b) or (c) and I have not modified
    it.

(d) I understand and agree that this project and the contribution
    are public and that a record of the contribution (including all
    personal information I submit with it, including my sign-off) is
    maintained indefinitely and may be redistributed consistent with
    this project or the open source license(s) involved.
```

