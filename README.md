# Corvus

[![Build Status](https://travis-ci.org/CoastalHacking/corvus-annotations.svg?branch=master)](https://travis-ci.org/CoastalHacking/corvus-annotations)

From [Wikipedia](https://en.wikipedia.org/wiki/Corvus):

> Corvus is a widely distributed genus of medium-sized to large birds in the family Corvidae. The genus includes species commonly known as crows, ravens, rooks and jackdaws;

> ...

> Recent research has found some crow species capable of not only tool use, but also tool construction. Crows are now considered to be among the world's most intelligent animals with an encephalization quotient equal to that of many non-human primates.

Corvus is a set of enhancements to the [Eclipse IDE](https://eclipse.org/ide/)
to aid security assessors when performing a manual security code review. Its
goal is to help document areas of interest for a security tester, organize
these areas for quick navigation and future reference, and add pertinent task
reminders for outstanding work that should be performed.

## Installing

* Download the zipped p2 update site located in this [directory](releng/us.coastalhacking.corvus.annotations.update/target/)
* In Eclipse, "Help" &rarr; "Install New Software"
  * Click "Add..."
  * Click "Archive..."
  * Select the downloaded zipped p2 update site, optionally give this site a name, and select OK
  * In the "Work with" dropdown, select the newly added site from above, select Corvus Annotations, and continue with the installation

## Getting Started

Once installed, Corvus adds the following [Views](http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2FgettingStarted%2Fqs-02b.htm):

* Controls
* Entry Points
* Security Issues
* Sinks
* Tainted Data

Within a text editor, you can use the below keyboard shortcuts. Currently all
shortcuts use the three key sequence `Shift + Command (Control) + A`, quickly
followed by a single key sequence.

* Add Entry Point: `Shift + Command (Control) + A` then `E`
* Add Sink: `Shift + Command (Control) + A` then `S`
* Add Issue: `Shift + Command (Control) + A` then `I`
* Add Taint: `Shift + Command (Control) + A` then `T`
* Add Control: `Shift + Command (Control) + A` then `C`

In some cases, the creation of a marker results in the creation of one or many
tasks, viewable in the "Tasks" view.

## Contributing

See the [contributing guidelines](CONTRIBUTING.MD) for details.

Some Eclipse projects in this repository have a `README.md` file that describe
the project in more detail.

## Architecture

This project uses [Tycho](https://eclipse.org/tycho/). For more information on
Tycho and its use in Corvus, please refer to
[this Vogella tutorial](http://www.vogella.com/tutorials/EclipseTycho/article.html). 

Of interest are four [bundles](https://en.wikipedia.org/wiki/OSGi#Bundles):

* [us.coastalhacking.corvus.annotations.api](bundles/us.coastalhacking.corvus.annotations.api):
  defines the Eclipse resource markers, annotations, and marker specifications.
* [us.coastalhacking.corvus.annotations.ui.common](bundles/us.coastalhacking.corvus.annotations.ui.common):
  common code used when creating markers from the UI
* [us.coastalhacking.corvus.annotations.ui.e3](bundles/us.coastalhacking.corvus.annotations.ui.e3):
  Eclipse 3.x menus and views
* [us.coastalhacking.corvus.annotations.ui.e4](bundles/us.coastalhacking.corvus.annotations.ui.e4):
  Eclipse e4 menus

## License

Corvus is licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0)
