# Spreadsheet CLI App

A command-line spreadsheet application built in Java for creating, managing, and displaying table data.

## Project Structure

### Core Classes

- **Frame.java** - Represents a single 2D table/spreadsheet with rows and columns
  - Stores data in a 2D Integer array
  - Provides methods to get/set cell values
  - Handles table display formatting

- **DataChart.java** - Container for managing multiple Frame objects
  - Stores multiple spreadsheets
  - Provides methods to add and retrieve frames
  - Generates decorative borders for CLI display

- **ngin.java** - Main entry point and CLI menu system
  - Interactive menu-driven interface
  - Handles user input and navigation
  - Manages current working frame

- **MatrixTester.java** - Utility class for matrix operations (not currently integrated)
  - `findExtrema()` - finds min/max values in rows and columns
  - `rotateArray()` - rotates matrix 90 degrees (has a known bug)

## Usage

### Compile
```bash
javac *.java
```

### Run
```bash
java ngin
```

### Menu Options

1. **Create New Chart** - Creates a new spreadsheet with specified rows and columns
2. **Display Current Chart** - Shows the currently active spreadsheet
3. **Add Value to Chart** - Insert a number at a specific row/column position
4. **Exit** - Close the application

### Example Session

```
********************
Welcome to Spreadsheet CLI
********************

1. Create New Chart
2. Display Current Chart
3. Add Value to Chart
4. Exit
Enter your choice: 1
Enter number of rows: 3
Enter number of columns: 3
Chart created successfully!

1. Create New Chart
2. Display Current Chart
3. Add Value to Chart
4. Exit
Enter your choice: 3
Enter row index: 0
Enter column index: 0
Enter value: 42
Value added successfully!

1. Create New Chart
2. Display Current Chart
3. Add Value to Chart
4. Exit
Enter your choice: 2
==================================================
42	null	null	
null	null	null	
null	null	null	

==================================================
```

## Features

- ✅ Create multiple named spreadsheets (Frames)
- ✅ Add values to specific cells
- ✅ Display formatted table output
- ✅ Store multiple charts in memory
- ✅ CLI-based menu navigation

## Known Issues

- MatrixTester.rotateArray() has rotation logic issues
- No data persistence (data lost when app exits)
- No file I/O support yet

## Future Enhancements

- [ ] Save/load spreadsheets to file
- [ ] Column and row labels
- [ ] Edit existing cell values
- [ ] Delete rows/columns
- [ ] Sort rows/columns
- [ ] Basic formulas (SUM, AVG, etc.)
- [ ] Better table formatting with borders
- [ ] Matrix operations from MatrixTester class
