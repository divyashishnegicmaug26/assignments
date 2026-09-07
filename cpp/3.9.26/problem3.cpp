#include <iostream>
#include <vector>
#include <string>
#include <cctype>
using namespace std;


// =========================
// Generic Template Class
// =========================

template <typename T>
class Buffer {
    vector<T> data;

public:
    void add(const T& value) {
        data.push_back(value);
    }

    T& operator[](int index) {
        return data[index];
    }

    const T& operator[](int index) const {
        return data[index];
    }

    int size() const {
        return data.size();
    }
};


// =========================
// Abstract Base Class
// =========================

class DataProcessor {
public:
    virtual void loadData(const string& source) = 0;

    virtual void processData() = 0;

    virtual void exportResult(const string& destination) = 0;

    virtual string processorType() const = 0;

    virtual int recordCount() const = 0;

    virtual void printSummary() const {
        cout << "Processor Type: " << processorType() << endl;
        cout << "Record Count: " << recordCount() << endl;
    }

    virtual ~DataProcessor() = default;
};


// =========================
// CSV Processor
// =========================

class CSVProcessor : public DataProcessor {
    Buffer<string> records;

public:

    void loadData(const string& source) override {

        // Simulating reading CSV data
        records.add("name,age,city");
        records.add("ashu,22,delhi");
        records.add("rahul,23,mumbai");
        records.add("rohit,21,jaipur");
        records.add("aman,24,dehradun");
    }


    void processData() override {

        for(int i = 0; i < records.size(); i++) {

            for(char& c : records[i]) {
                c = toupper(c);
            }
        }
    }


    void exportResult(const string& destination) override {

        cout << "[CSV EXPORT -> " << destination << "]" << endl;

        for(int i = 0; i < records.size(); i++) {
            cout << records[i] << endl;
        }
    }


    string processorType() const override {
        return "CSV Processor";
    }


    int recordCount() const override {
        return records.size();
    }
};


// =========================
// Sensor Stream Processor
// =========================

class SensorStreamProcessor : public DataProcessor {
    Buffer<double> readings;

public:

    void loadData(const string& source) override {

        // Simulating sensor readings
        readings.add(23.4);
        readings.add(21.8);
        readings.add(25.1);
        readings.add(22.6);
        readings.add(24.3);
        readings.add(26.0);
        readings.add(20.9);
        readings.add(23.7);
    }


    void processData() override {

        double min = readings[0];
        double max = readings[0];
        double sum = 0;

        for(int i = 0; i < readings.size(); i++) {

            sum += readings[i];

            if(min > readings[i]) {
                min = readings[i];
            }

            if(max < readings[i]) {
                max = readings[i];
            }
        }

        double mean = sum / readings.size();

        cout << "Mean: " << mean << endl;
        cout << "Min: " << min << endl;
        cout << "Max: " << max << endl;
    }


    void exportResult(const string& destination) override {

        cout << "[SENSOR EXPORT -> " << destination << "]" << endl;

        processData();
    }


    string processorType() const override {
        return "Sensor Stream Processor";
    }


    int recordCount() const override {
        return readings.size();
    }
};


// =========================
// Main
// =========================

int main() {

    vector<DataProcessor*> pipeline;

    pipeline.push_back(new CSVProcessor());
    pipeline.push_back(new SensorStreamProcessor());


    for(auto* p : pipeline) {

        p->loadData("source_data");

        p->processData();

        p->printSummary();

        p->exportResult("output_dir");

        cout << "---" << endl;
    }


    // Delete objects
    for(auto* p : pipeline) {
        delete p;
    }

    return 0;
}